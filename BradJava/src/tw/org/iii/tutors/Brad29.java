package tw.org.iii.tutors;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Brad29 extends JFrame {
	private JButton b1, b2, b3;
	private JTextArea textArea;
	public Brad29() {
		setSize(640, 480);
		
		setLayout(new BorderLayout());
		
		JPanel top = new JPanel(new FlowLayout());
		b1 = new JButton("B1");b2 = new JButton("B2");b3 = new JButton("B3");
		top.add(b1);top.add(b2);top.add(b3);
		
		add(top, BorderLayout.NORTH);
		
		textArea = new JTextArea();
		add(textArea, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Brad29();
	}

}
