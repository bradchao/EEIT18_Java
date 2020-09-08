package tw.org.iii.tutors;

import javax.swing.JFrame;

public class GuessNumber extends JFrame {
	public GuessNumber() {
		super("GuessNumber Game");
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GuessNumber();
	}

}
