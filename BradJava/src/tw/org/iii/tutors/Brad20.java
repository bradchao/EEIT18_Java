package tw.org.iii.tutors;

import tw.org.iii.myclasses.TWId;

public class Brad20 {

	public static void main(String[] args) {
		String s1 = new String("Brad");
		String s2 = s1;
		String s3 = s1.concat("Chao");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		if (TWId.isRightId("Y123456789")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
