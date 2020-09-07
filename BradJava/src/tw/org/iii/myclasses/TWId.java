package tw.org.iii.myclasses;

public class TWId {
	private String id;
	
	public static boolean isRightId(String id) {
		boolean ret = false;
		String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
		if (id.matches("[A-Z][12][0-9]{8}")) {
			char c1 = id.charAt(0);
			int n12 = letters.indexOf(c1) + 10;
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			System.out.println(n1 + ":" + n2);
		}
		return ret;
	}
}
