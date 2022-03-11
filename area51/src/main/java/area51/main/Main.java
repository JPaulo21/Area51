package area51.main;

import area51.view.Frame;

public class Main {

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            Frame f = new Frame();
	            f.setVisible(true);
	           
	        }
	    });
		
	}
	 
}
