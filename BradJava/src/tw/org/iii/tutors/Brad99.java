package tw.org.iii.tutors;

public class Brad99 {
	public static void main(String[] args) {
		for (int k=0; k<4; k++) {
			for (int j = 1; j<=9; j++) {
				for (int i=2; i<=5; i++) {
					int newi = i + k * 4;
					int r = newi * j;
					System.out.print(
						String.format("%d x %d = %d\t", newi, j, r));
				}
				System.out.println();
			}
			System.out.println("-----");
		}
	}
}
