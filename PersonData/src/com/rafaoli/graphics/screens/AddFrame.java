package com.rafaoli.graphics.screens;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.rafaoli.graphics.AppScreen;
import com.rafaoli.graphics.actionListeners.AddBtnAddInternalListener;
import com.rafaoli.graphics.actionListeners.AddBtnCancelListener;
import com.rafaoli.service.PessoaService;
import com.rafaoli.utils.Constantes;
/*
 * Essa classe foi constru�da com o aux�lio do plug-in WindowTool
 * */
public class AddFrame extends JFrame {

	private JPanel contentPane;
	private JTextField fieldName;
	private JTextField fieldRG;
	private JTextField fieldEmail;
	private JTextField fieldTelefone;

	private JComboBox comboEmail;
	private JComboBox comboTelefone;
	private JComboBox comboEndereco;
	
	private PessoaService pessoaService;
	private AppScreen appScreen;	
	private JTextField fieldLogradouro;
	private JTextField fieldNumero;
	private JTextField fieldComplemento;
	private JTextField fieldBairro;
	private JTextField fieldCEP;
	private JTextField fieldCidade;

	public AddFrame( PessoaService p_pessoaService, AppScreen p_appScreen ) {
		super("Adicionar Contato");
		pessoaService = p_pessoaService;
		appScreen = p_appScreen;
		
		setBounds(100, 100, 583, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(24, 40, 36, 26);
		contentPane.add(lblNewLabel);
		
		fieldName = new JTextField();
		fieldName.setToolTipText("Digite o nome aqui!");
		fieldName.setBounds(67, 43, 267, 20);
		contentPane.add(fieldName);
		fieldName.setColumns(10);
		
		JLabel lblRG = new JLabel("RG");
		lblRG.setBounds(24, 77, 46, 14);
		contentPane.add(lblRG);
		
		fieldRG = new JTextField();
		fieldRG.setToolTipText("Digite o RG aqui!");
		fieldRG.setColumns(10);
		fieldRG.setBounds(67, 74, 267, 20);
		contentPane.add(fieldRG);
		
		JLabel lblDtNascimento = new JLabel("Data de Nascimento");
		lblDtNascimento.setBounds(24, 102, 103, 20);
		contentPane.add(lblDtNascimento);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setBounds(24, 134, 46, 26);
		contentPane.add(lblEmail);
		
		comboEmail = new JComboBox(Constantes.OPCOES_EMAIL);
		comboEmail.setBounds(358, 136, 114, 22);
		contentPane.add(comboEmail);
		
		fieldEmail = new JTextField();
		fieldEmail.setToolTipText("Digite o nome aqui!");
		fieldEmail.setColumns(10);
		fieldEmail.setBounds(67, 133, 267, 20);
		contentPane.add(fieldEmail);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(24, 167, 46, 26);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Endereco");
		lblEndereco.setBounds(24, 202, 70, 26);
		contentPane.add(lblEndereco);
		
		fieldTelefone = new JTextField();
		fieldTelefone.setToolTipText("Digite o telefone aqui!");
		fieldTelefone.setColumns(10);
		fieldTelefone.setBounds(67, 170, 267, 20);
		contentPane.add(fieldTelefone);
		
		comboTelefone = new JComboBox( Constantes.OPCOES_TELEFONE );
		comboTelefone.setBounds(358, 169, 114, 22);
		contentPane.add(comboTelefone);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(137, 441, 89, 23);
		contentPane.add(btnAdicionar);
		btnAdicionar.addActionListener( new AddBtnAddInternalListener( p_pessoaService, this ) );
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(245, 441, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblLogradouro = new JLabel("Logradouro");
		lblLogradouro.setBounds(24, 226, 80, 26);
		contentPane.add(lblLogradouro);
		
		fieldLogradouro = new JTextField();
		fieldLogradouro.setToolTipText("");
		fieldLogradouro.setColumns(10);
		fieldLogradouro.setBounds(104, 229, 267, 20);
		contentPane.add(fieldLogradouro);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setBounds(24, 249, 60, 26);
		contentPane.add(lblNumero);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(24, 275, 80, 26);
		contentPane.add(lblComplemento);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(24, 300, 60, 26);
		contentPane.add(lblBairro);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setBounds(24, 326, 60, 26);
		contentPane.add(lblCEP);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(24, 352, 60, 26);
		contentPane.add(lblCidade);
		
		fieldNumero = new JTextField();
		fieldNumero.setToolTipText("");
		fieldNumero.setColumns(10);
		fieldNumero.setBounds(104, 252, 267, 20);
		contentPane.add(fieldNumero);
		
		fieldComplemento = new JTextField();
		fieldComplemento.setToolTipText("");
		fieldComplemento.setColumns(10);
		fieldComplemento.setBounds(104, 278, 267, 20);
		contentPane.add(fieldComplemento);
		
		fieldBairro = new JTextField();
		fieldBairro.setToolTipText("");
		fieldBairro.setColumns(10);
		fieldBairro.setBounds(104, 303, 267, 20);
		contentPane.add(fieldBairro);
		
		fieldCEP = new JTextField();
		fieldCEP.setToolTipText("");
		fieldCEP.setColumns(10);
		fieldCEP.setBounds(104, 329, 267, 20);
		contentPane.add(fieldCEP);
		
		fieldCidade = new JTextField();
		fieldCidade.setToolTipText("");
		fieldCidade.setColumns(10);
		fieldCidade.setBounds(104, 355, 267, 20);
		contentPane.add(fieldCidade);
		
		comboEndereco = new JComboBox( Constantes.OPCOES_ENDERECO );
		comboEndereco.setBounds(104, 204, 140, 22);
		contentPane.add(comboEndereco);
		btnCancelar.addActionListener( new AddBtnCancelListener( this ) );
	}


	public JTextField getFieldName() {
		return fieldName;
	}


	public JTextField getFieldRG() {
		return fieldRG;
	}


	public JTextField getFieldEmail() {
		return fieldEmail;
	}


	public JTextField getFieldTelefone() {
		return fieldTelefone;
	}	

	public JComboBox getComboEmail() {
		return comboEmail;
	}
	
	public JComboBox getComboTelefone() {
		return comboTelefone;
	}
	
	public JComboBox getComboEndereco() {
		return comboEndereco;
	}

	public JTextField getFieldLogradouro() {
		return fieldLogradouro;
	}


	public void setFieldLogradouro(JTextField fieldLogradouro) {
		this.fieldLogradouro = fieldLogradouro;
	}


	public JTextField getFieldComplemento() {
		return fieldComplemento;
	}


	public void setFieldComplemento(JTextField fieldComplemento) {
		this.fieldComplemento = fieldComplemento;
	}


	public JTextField getFieldBairro() {
		return fieldBairro;
	}


	public void setFieldBairro(JTextField fieldBairro) {
		this.fieldBairro = fieldBairro;
	}


	public JTextField getFieldCEP() {
		return fieldCEP;
	}


	public void setFieldCEP(JTextField fieldCEP) {
		this.fieldCEP = fieldCEP;
	}


	public JTextField getFieldCidade() {
		return fieldCidade;
	}


	public void setFieldCidade(JTextField fieldCidade) {
		this.fieldCidade = fieldCidade;
	}


	public void setFieldEmail(JTextField fieldEmail) {
		this.fieldEmail = fieldEmail;
	}

	public JTextField getFieldNumero() {
		return fieldNumero;
	}


	public AppScreen getAppScreen() {
		return appScreen;
	}
}