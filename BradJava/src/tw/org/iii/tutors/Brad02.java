package tw.org.iii.tutors;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Brad02 {
	public static void main(String[] args) {
		String strX = JOptionPane.showInputDialog("x = ?");
		String strY = JOptionPane.showInputDialog("Y = ?");
		
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		int r1 = x + y;
		int r2 = x - y;
		int r3 = x * y;
		int r4 = x / y;
		int r5 = x % y;
		System.out.println(String.format("%d + %d = %d",x,y,r1 ));
		System.out.println(String.format("%d - %d = %d",x,y,r2 ));
		System.out.println(String.format("%d x %d = %d",x,y,r3 ));
		System.out.println(String.format("%d / %d = %d ... %d",x,y,r4, r5 ));
	}
}
