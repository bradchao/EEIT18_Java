package tw.org.iii.tutors;

public class Brad15 {

	public static void main(String[] args) {
		int[] p = new int[6];	// p[0] ~ p[5]
		
		for (int i=0; i<1000000; i++) {
			int point = (int)(Math.random()*9);
			p[point>=6?point-3:point]++;
		}
		for (int i=0;i<p.length; i++) {
			System.out.printf("%d點出現%d次\n", i+1, p[i]);
		}
	}

}
