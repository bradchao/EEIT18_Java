package tw.org.iii.tutors;

import java.util.Scanner;

public class Brad03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("X = ");
		int x = scanner.nextInt();
		System.out.print("Y = ");
		int y = scanner.nextInt();
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
