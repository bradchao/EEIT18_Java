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

		TWId id1 = new TWId();
		TWId id2 = new TWId(true);
		TWId id3 = new TWId(7);
		TWId id4 = new TWId(false, 4);
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
	}

}
