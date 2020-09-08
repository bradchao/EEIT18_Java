package tw.org.iii.tutors;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame implements ActionListener{
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	
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
		
		guess.addActionListener(this);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		answer = createAnswer(3);
	}
	
	public static void main(String[] args) {
		new GuessNumber();
	}

	public void actionPerformed(ActionEvent e) {
		String str = input.getText();
		log.append(str +"\n");
		input.setText("");
		System.out.println(createAnswer(5));
	}

	private String createAnswer(int d) {
		int[] poker = new int[10];
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=poker.length-1;i>0;i--) {
			int rand = (int)(Math.random()*(i+1));
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<d; i++) {
			sb.append(poker[i]);
		}
		
		return sb.toString();
	}
	
}
