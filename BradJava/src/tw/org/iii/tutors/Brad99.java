package tw.org.iii.tutors;

public class Brad99 {
	public static void main(String[] args) {
		for (int k=0; k<2; k++) {
			for (int j = 1; j<=9; j++) {
				for (int i=2; i<=5; i++) {
					int r = i * j;
					System.out.print(
						String.format("%d x %d = %d\t", i, j, r));
				}
				System.out.println();
			}
			System.out.println("-----");
		}
	}
}
