package area51.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.metal.MetalBorders;
import javax.swing.text.MaskFormatter;

import area51.Controller.ControllerAluno;
import area51.Exception.AlunoInvalidoException;
import area51.Model.Aluno;

public class JCadastroAluno extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JTextField nomeTextField;
	private JTextField emailTextField;
	private JComboBox<String> sexoComboBox;
	private JFormattedTextField cpfTextField;
	AlunoInvalidoException alunoInvalidoException;
	
	private Aluno aluno;
	private JTextField celularTextField;
	private JTextField objetivoTextField;

	
	public JCadastroAluno() {
		setLayout(new BorderLayout(490, 0));
		
		JPanel Cabecalho = new JPanel();
		add(Cabecalho, BorderLayout.NORTH);
		GridBagLayout gbl_Cabecalho = new GridBagLayout();
		gbl_Cabecalho.columnWidths = new int[]{0, 0};
		gbl_Cabecalho.rowHeights = new int[]{0, 0};
		gbl_Cabecalho.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_Cabecalho.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		Cabecalho.setLayout(gbl_Cabecalho);
		
		JLabel lblTitulo = new JLabel("Cadastro Aluno");
		lblTitulo.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridx = 0;
		gbc_lblTitulo.gridy = 0;
		Cabecalho.add(lblTitulo, gbc_lblTitulo);
		
		JPanel Corpo = new JPanel();
		Corpo.setBorder(new TitledBorder(null, "Dados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(Corpo, BorderLayout.CENTER);
		GridBagLayout gbl_Corpo = new GridBagLayout();
		gbl_Corpo.columnWidths = new int[]{31, 105, 23, 118, 28, -41, 73, 0, 0};
		gbl_Corpo.rowHeights = new int[]{20, 20, 0};
		gbl_Corpo.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Corpo.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		Corpo.setLayout(gbl_Corpo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		Corpo.add(lblNome, gbc_lblNome);
		
		nomeTextField = new JTextField();
		GridBagConstraints gbc_nomeTextField = new GridBagConstraints();
		gbc_nomeTextField.anchor = GridBagConstraints.NORTHWEST;
		gbc_nomeTextField.insets = new Insets(0, 0, 5, 5);
		gbc_nomeTextField.gridx = 1;
		gbc_nomeTextField.gridy = 0;
		Corpo.add(nomeTextField, gbc_nomeTextField);
		nomeTextField.setColumns(25);
		
		JLabel lblCPF = new JLabel("CPF:");
		GridBagConstraints gbc_lblCPF = new GridBagConstraints();
		gbc_lblCPF.anchor = GridBagConstraints.WEST;
		gbc_lblCPF.insets = new Insets(0, 0, 5, 5);
		gbc_lblCPF.gridx = 2;
		gbc_lblCPF.gridy = 0;
		Corpo.add(lblCPF, gbc_lblCPF);
		
		MaskFormatter maskDtNasc = null;
		try {	
			maskDtNasc = new MaskFormatter("###.###.###-##");
		} catch (ParseException e2) {
		
			e2.printStackTrace();
		}
		cpfTextField = new JFormattedTextField(maskDtNasc);
		cpfTextField.setColumns(14);
		GridBagConstraints gbc_cpfTextField = new GridBagConstraints();
		gbc_cpfTextField.anchor = GridBagConstraints.NORTHWEST;
		gbc_cpfTextField.insets = new Insets(0, 0, 5, 5);
		gbc_cpfTextField.gridx = 3;
		gbc_cpfTextField.gridy = 0;
		Corpo.add(cpfTextField, gbc_cpfTextField);
		
		JLabel lblSexo = new JLabel("Sexo:");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.anchor = GridBagConstraints.WEST;
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 4;
		gbc_lblSexo.gridy = 0;
		Corpo.add(lblSexo, gbc_lblSexo);
		
		sexoComboBox = new JComboBox<String>();
		sexoComboBox.setMaximumRowCount(2);
		sexoComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"M", "F"}));
		
		GridBagConstraints gbc_sexoComboBox = new GridBagConstraints();
		gbc_sexoComboBox.anchor = GridBagConstraints.NORTHWEST;
		gbc_sexoComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_sexoComboBox.gridx = 5;
		gbc_sexoComboBox.gridy = 0;
		Corpo.add(sexoComboBox, gbc_sexoComboBox);
		
		JLabel lblHorario = new JLabel("Horário preferido de treino:");
		lblHorario.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblHorario = new GridBagConstraints();
		gbc_lblHorario.anchor = GridBagConstraints.WEST;
		gbc_lblHorario.insets = new Insets(0, 0, 5, 5);
		gbc_lblHorario.gridx = 6;
		gbc_lblHorario.gridy = 0;
		Corpo.add(lblHorario, gbc_lblHorario);
		
		JComboBox<String> horarioComboBox = new JComboBox<String>();
		horarioComboBox.setMaximumRowCount(5);
		horarioComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"-", "Manhã", "Tarde", "Noite"}));
		GridBagConstraints gbc_horarioComboBox = new GridBagConstraints();
		gbc_horarioComboBox.anchor = GridBagConstraints.WEST;
		gbc_horarioComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_horarioComboBox.gridx = 7;
		gbc_horarioComboBox.gridy = 0;
		Corpo.add(horarioComboBox, gbc_horarioComboBox);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 0, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 1;
		Corpo.add(lblEmail, gbc_lblEmail);
		
		emailTextField = new JTextField();
		GridBagConstraints gbc_emailTextField = new GridBagConstraints();
		gbc_emailTextField.anchor = GridBagConstraints.NORTHWEST;
		gbc_emailTextField.insets = new Insets(0, 0, 0, 5);
		gbc_emailTextField.gridx = 1;
		gbc_emailTextField.gridy = 1;
		Corpo.add(emailTextField, gbc_emailTextField);
		emailTextField.setColumns(20);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblCelular = new GridBagConstraints();
		gbc_lblCelular.anchor = GridBagConstraints.WEST;
		gbc_lblCelular.insets = new Insets(0, 0, 0, 5);
		gbc_lblCelular.gridx = 2;
		gbc_lblCelular.gridy = 1;
		Corpo.add(lblCelular, gbc_lblCelular);
		
		celularTextField = new JTextField();
		GridBagConstraints gbc_celularTextField = new GridBagConstraints();
		gbc_celularTextField.insets = new Insets(0, 0, 0, 5);
		gbc_celularTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_celularTextField.gridx = 3;
		gbc_celularTextField.gridy = 1;
		Corpo.add(celularTextField, gbc_celularTextField);
		celularTextField.setColumns(10);
		
		JLabel lblObjetivo = new JLabel("Objetivo:");
		GridBagConstraints gbc_lblObjetivo = new GridBagConstraints();
		gbc_lblObjetivo.anchor = GridBagConstraints.WEST;
		gbc_lblObjetivo.insets = new Insets(0, 0, 0, 5);
		gbc_lblObjetivo.gridx = 4;
		gbc_lblObjetivo.gridy = 1;
		Corpo.add(lblObjetivo, gbc_lblObjetivo);
		
		objetivoTextField = new JTextField();
		GridBagConstraints gbc_objetivoTextField = new GridBagConstraints();
		gbc_objetivoTextField.anchor = GridBagConstraints.WEST;
		gbc_objetivoTextField.gridwidth = 2;
		gbc_objetivoTextField.insets = new Insets(0, 0, 0, 5);
		gbc_objetivoTextField.gridx = 5;
		gbc_objetivoTextField.gridy = 1;
		Corpo.add(objetivoTextField, gbc_objetivoTextField);
		objetivoTextField.setColumns(10);
		
		MaskFormatter maskCPF = null;
		try {
			maskCPF = new MaskFormatter("###.###.###-##");
		} catch (ParseException e2) {
			
			e2.printStackTrace();
		}
		maskCPF.setPlaceholderCharacter('_');
		
		JPanel Footer = new JPanel();
		add(Footer, BorderLayout.SOUTH);
		GridBagLayout gbl_Footer = new GridBagLayout();
		gbl_Footer.columnWidths = new int[]{0, 0};
		gbl_Footer.rowHeights = new int[]{0, 0};
		gbl_Footer.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_Footer.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		Footer.setLayout(gbl_Footer);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aluno = new Aluno();
				ControllerAluno c = new ControllerAluno();
				
				aluno.setNome(nomeTextField.getText());
				aluno.setCpf(cpfTextField.getText());
				aluno.setSexo(sexoComboBox.getSelectedItem().toString());
				aluno.setEmail(emailTextField.getText().toLowerCase());
				
				try {
					nomeTextField.setBorder(MetalBorders.getTextFieldBorder());
					cpfTextField.setBorder(MetalBorders.getTextFieldBorder());
					emailTextField.setBorder(MetalBorders.getTextFieldBorder());
					
					System.out.println(aluno.getCpf());
					c.cadastrarAluno(aluno);
					
					JOptionPane.showMessageDialog(null, "Cadastrado");
					
					nomeTextField.setText(null);
					cpfTextField.setText(null);
					emailTextField.setText(null);
					
					System.out.println(aluno);
					
				} catch(AlunoInvalidoException a){
					
					if (a.isNomeVazio() == true)
						erroEncontrado(nomeTextField);
						System.out.println("a.isNomeVazio():"+a.isNomeVazio());
					if (a.isNomeInvalido() == true)
						erroEncontrado(nomeTextField);
					if (a.isCpfVazio()== true)
						erroEncontrado(cpfTextField);
						System.out.println("a.isCpfVazio():"+a.isCpfVazio());
					if (a.isCpfInvalido() == true)
						erroEncontrado(cpfTextField);
						System.out.println("a.isCpfInvalido():"+a.isCpfInvalido());
					if (a.isEmailVazio() == true)
						erroEncontrado(emailTextField);
						System.out.println("a.isEmailVazio():"+a.isEmailVazio());
					if (a.isEmailInvalido() == true)
						erroEncontrado(emailTextField);
						System.out.println("a.isEmailInvalido():"+a.isEmailInvalido());
					//erroEncontrado(celularTextField);
					
				} 
			}
		});
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.anchor = GridBagConstraints.EAST;
		gbc_btnVoltar.weightx = 10.0;
		gbc_btnVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar.gridx = 0;
		gbc_btnVoltar.gridy = 0;
		Footer.add(btnVoltar, gbc_btnVoltar);
		btnCadastrar.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCadastrar.gridheight = 2;
		gbc_btnCadastrar.anchor = GridBagConstraints.EAST;
		gbc_btnCadastrar.gridx = 1;
		gbc_btnCadastrar.gridy = 0;
		Footer.add(btnCadastrar, gbc_btnCadastrar);
		
	}
	
	public static void erroEncontrado(JTextField jTextField) {
		
		jTextField.setBorder(new LineBorder(Color.RED,1));
		
	}

}
