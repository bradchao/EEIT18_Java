package tw.org.iii.tutors;

import java.util.Scanner;

public class Brad04 {
	public static void main(String[] args) {
		// float, double
		Scanner scanner = new Scanner(System.in);
		System.out.print("X = ");
		double x = scanner.nextDouble();
		System.out.print("Y = ");
		double y = scanner.nextDouble();
		double r1 = x + y;
		double r2 = x - y;
		double r3 = x * y;
		double r4 = x / y;
		System.out.println(String.format("%f + %f = %f",x,y,r1 ));
		System.out.println(String.format("%f - %f = %f",x,y,r2 ));
		System.out.println(String.format("%f x %f = %f",x,y,r3 ));
		System.out.println(String.format("%f / %f = %f",x,y,r4));
	
		System.out.printf("%f + %f = %f\n", x, y, r1);
		System.out.printf("%f - %f = %f", x, y, r2);
	}
}
