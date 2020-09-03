package tw.org.iii.tutors;

import java.util.Scanner;

public class Brad02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("X = ");
		int x = scanner.nextInt();
		System.out.print("Y = ");
		int y = scanner.nextInt();
		int r = x + y;
		System.out.println(String.format("%d + %d = %d",x,y,r ));
	}
}
