package area51.view;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame{

		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Frame() {
		
		setVisible(true);
		setBounds(100, 100, 1000, 700);
		setTitle("Academia area51");
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame.class.getResource("/area51/view/halter.png")));
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//jf.setContentPane();
	
		setContentPane(new JCadastroAluno());
		
	} 
	
}
