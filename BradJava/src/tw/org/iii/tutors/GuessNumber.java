package tw.org.iii.tutors;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	
	public GuessNumber() {
		super("GuessNumber Game");
		
		setLayout(new BorderLayout());
		
		guess = new JButton("Guess");
		input = new JTextField();
		log = new JTextArea();
		
		add(log, BorderLayout.CENTER);
		
		JPanel topLine = new JPanel(new BorderLayout());
		topLine.add(guess, BorderLayout.EAST);
		topLine.add(input, BorderLayout.CENTER);
		
		add(topLine, BorderLayout.NORTH);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GuessNumber();
	}

}
