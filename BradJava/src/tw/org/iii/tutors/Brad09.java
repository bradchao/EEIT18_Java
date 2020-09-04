package tw.org.iii.tutors;

public class Brad09 {

	public static void main(String[] args) {
		int a = 10,  b = 3;
		if (--a >= 10 & b-- <= 10) {
			System.out.println(
				String.format("true => a=%d,b=%d", a, b));
		}else {
			System.out.println(
					String.format("false => a=%d,b=%d", a, b));
		}
		
		int c = 2, d = 3;
		System.out.println(c ^ d);
		
	}

}
