package area51.view;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Insets;
import java.text.ParseException;

import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JCadastroAluno extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JTextField txtfNome;

	
	public JCadastroAluno() {
		setLayout(new BorderLayout(0, 0));
		
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
		gbl_Corpo.columnWidths = new int[]{46, 86, 0, 0, 0, 0};
		gbl_Corpo.rowHeights = new int[]{20, 0, 0};
		gbl_Corpo.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 1.0};
		gbl_Corpo.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		Corpo.setLayout(gbl_Corpo);
		
		JLabel lblNome = new JLabel("Nome:");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.WEST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		Corpo.add(lblNome, gbc_lblNome);
		
		txtfNome = new JTextField();
		GridBagConstraints gbc_txtfNome = new GridBagConstraints();
		gbc_txtfNome.insets = new Insets(0, 0, 5, 5);
		gbc_txtfNome.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtfNome.gridx = 1;
		gbc_txtfNome.gridy = 0;
		Corpo.add(txtfNome, gbc_txtfNome);
		txtfNome.setColumns(20);
		
		JLabel lblCPF = new JLabel("CPF:");
		GridBagConstraints gbc_lblCPF = new GridBagConstraints();
		gbc_lblCPF.anchor = GridBagConstraints.EAST;
		gbc_lblCPF.insets = new Insets(0, 0, 5, 5);
		gbc_lblCPF.gridx = 2;
		gbc_lblCPF.gridy = 0;
		Corpo.add(lblCPF, gbc_lblCPF);
		
		MaskFormatter maskCPF = null;
		try {
			maskCPF = new MaskFormatter("###.###.###-##");
		} catch (ParseException e2) {
			
			e2.printStackTrace();
		}
		maskCPF.setPlaceholderCharacter('_');
		JFormattedTextField formattedTextField = new JFormattedTextField(maskCPF);
		formattedTextField.setColumns(14);
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 3;
		gbc_formattedTextField.gridy = 0;
		Corpo.add(formattedTextField, gbc_formattedTextField);
		
		JLabel lblNewLabel = new JLabel("Sexo:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 0;
		Corpo.add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(2);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 5;
		gbc_comboBox.gridy = 0;
		Corpo.add(comboBox, gbc_comboBox);
		
		JPanel Footer = new JPanel();
		add(Footer, BorderLayout.SOUTH);
		GridBagLayout gbl_Footer = new GridBagLayout();
		gbl_Footer.columnWidths = new int[]{0, 0};
		gbl_Footer.rowHeights = new int[]{0, 0};
		gbl_Footer.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_Footer.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		Footer.setLayout(gbl_Footer);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.gridwidth = 0;
		gbc_btnCadastrar.insets = new Insets(0, 0, 0, 3);
		gbc_btnCadastrar.gridheight = 2;
		gbc_btnCadastrar.anchor = GridBagConstraints.EAST;
		gbc_btnCadastrar.gridx = 0;
		gbc_btnCadastrar.gridy = 0;
		Footer.add(btnCadastrar, gbc_btnCadastrar);
	
		

		
	}

}
