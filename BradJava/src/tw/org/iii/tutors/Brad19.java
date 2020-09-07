package tw.org.iii.tutors;

public class Brad19 {

	public static void main(String[] args) {
		String str1 = new String();
		byte[] b1 = {97,98,99,100};
		String str2 = new String(b1); // abcd
		String str3 = new String(b1, 1, 2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		String str4 = "Brad";
		int a = 10;
		System.out.println(str2.charAt(2));
		System.out.println("Brad".charAt(2));
	}

}
