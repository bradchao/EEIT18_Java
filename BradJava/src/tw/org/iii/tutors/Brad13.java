package tw.org.iii.tutors;

public class Brad13 {
	public static void main(String[] args) {
		int[] a;
		a = new int[3];	// a[0], a[1], a[2]; +int
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("---");
		a[2] = 123;
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("---");
		a = new int[4];
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}
}
