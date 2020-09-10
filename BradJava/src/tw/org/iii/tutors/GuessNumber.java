package tw.org.iii.tutors;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame implements ActionListener{
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int d = 3;
	
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
		MyListener myListener = new MyListener(this);
		guess.addActionListener(myListener);
		log.setFont(new Font(null, Font.PLAIN, 48));
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initGame();
	}
	
	private void initGame() {
		answer = createAnswer(d);
		counter = 0 ;
		input.setText("");
		log.setText("");
	}
	
	public static void main(String[] args) {
		new GuessNumber();
	}

	private int counter;
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("here");
		counter++;
		String str = input.getText();
		String result = checkAB(str);
		log.append(counter + ". " + str + " => " + result + "\n");
		input.setText("");
		
		if (result.equals(d + "A0B")) {
			JOptionPane.showMessageDialog(this, "恭喜老爺");
			initGame();
		}else if(counter == 3) {
			JOptionPane.showMessageDialog(this, "Loser:" + answer);
			initGame();
		}
		
	}

	private String checkAB(String g) {
		int A, B; A = B = 0;
		for (int i=0; i<answer.length(); i++) {
			if (answer.charAt(i) == g.charAt(i)) {
				A++;
			}else if(answer.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		return String.format("%dA%dB", A,B);
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

class MyListener implements ActionListener {
	private GuessNumber guessNumber;
	public MyListener(GuessNumber guessNumber) {
		this.guessNumber = guessNumber;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
		
	}
	
}

