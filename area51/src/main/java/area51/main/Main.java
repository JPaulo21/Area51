package area51.main;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame();
		
	}
	
	public static void Frame() {
		
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setBounds(100, 100, 800, 700);
		jf.setTitle("Academia area51");
		jf.setLocationRelativeTo(null);
	    ImageIcon icone = new ImageIcon(ImageIO.read("img/haltere.png");
	    Image img = icone.getImage();
	    jf.setIconImage(img);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//jf.setContentPane();
		
	} 
}
