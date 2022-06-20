package com.rafaoli.graphics.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.HashMap;

import javax.swing.JList;

import com.rafaoli.domain.Endereco;
import com.rafaoli.domain.Pessoa;
import com.rafaoli.graphics.AppScreen;
import com.rafaoli.graphics.screens.AltFrame;
import com.rafaoli.service.PessoaService;

public class AltBtnInternalListener implements ActionListener {

	private PessoaService pessoaService;
	private AltFrame altFrame;
	private AppScreen appScreen;
	
	private int index;
	
	public AltBtnInternalListener( PessoaService p_pessoaService, AltFrame p_altFrame, AppScreen p_appScreen ) {
		pessoaService = p_pessoaService;
		altFrame = p_altFrame;
		appScreen = p_appScreen;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Pessoa pessoaAtualizada = new Pessoa();		
		
		pessoaAtualizada.setNome( altFrame.getFieldName().getText() );
		pessoaAtualizada.setRg( altFrame.getFieldRG().getText() );
		pessoaAtualizada.setData_nascimento( new Date() );
		
		HashMap<String, String> emailMap = new HashMap<String,String>();		
		String email = altFrame.getFieldEmail().getText();
		String opcaoEmail = (String)altFrame.getComboEmail().getSelectedItem().toString();		
		emailMap.put(email, opcaoEmail);		
		pessoaAtualizada.setEmail( emailMap );
		
		HashMap<String, String> telefoneMap = new HashMap<String,String>();		
		String telefone = altFrame.getFieldTelefone().getText();
		String opcaoTelefone = (String)altFrame.getComboTelefone().getSelectedItem().toString();		
		telefoneMap.put(telefone, opcaoTelefone);		
		pessoaAtualizada.setTelefone( telefoneMap );		
		
		Endereco novoEndereco = new Endereco();
		
		novoEndereco.setLogradouro(altFrame.getFieldLogradouro().getText());
		novoEndereco.setBairro(altFrame.getFieldBairro().getText());
		novoEndereco.setCep(altFrame.getFieldCEP().getText());
		novoEndereco.setCidade(altFrame.getFieldCidade().getText());
		novoEndereco.setComplemento(altFrame.getFieldComplemento().getText());
		novoEndereco.setNumero(altFrame.getFieldNumero().getText());
		
		HashMap<Endereco, String> enderecoMap = new HashMap<Endereco,String>();		
		String opcaoEndereco = (String)altFrame.getComboEndereco().getSelectedItem().toString();		

		enderecoMap.put(novoEndereco, opcaoEndereco);

		pessoaAtualizada.setEndereco(enderecoMap);
		pessoaService.alterarContato( pessoaAtualizada, appScreen.getIndexSelecionado() );
		altFrame.getAppScreen().refreshJList();
	}
	


}