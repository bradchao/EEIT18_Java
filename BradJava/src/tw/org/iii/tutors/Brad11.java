package tw.org.iii.tutors;

public class Brad11 {

	public static void main(String[] args) {
		int i = 0;
		for (init(); i<10;drawLine()) {
			System.out.println(i++);
		}
	}
	static void init() {
		System.out.println("Brad");
	}
	static void drawLine() {
		System.out.println("-----");
	}

}
