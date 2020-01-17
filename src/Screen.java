import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import  javax.swing.JFrame;

public class Screen extends JFrame {

	public Screen() {
		
		this.setSize(800,440);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}
	
	
	public static void main(String [] args) {
		
		Screen screen = new Screen();
		MyCanvas canvas = new MyCanvas();
		screen.getContentPane().add(canvas);
		
	}
	
}
