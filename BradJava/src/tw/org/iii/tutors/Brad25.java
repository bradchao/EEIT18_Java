package tw.org.iii.tutors;

import tw.org.iii.myclasses.TWId;

public class Brad25 {

	public static void main(String[] args) {
		TWId id1 = TWId.createTWId("A123456789");
		TWId id2 = TWId.createTWId("A123456789");
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id1 == id2);
		System.out.println(id1.equals(id2));
	}

}
