package tw.org.iii.tutors;

public class PokerV3 {
	public static void main(String[] args) {
		//long start = System.currentTimeMillis();
		int[] poker = new int[52];
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=poker.length-1;i>0;i--) {
			int rand = (int)(Math.random()*(i+1));
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		
		// for-each
		for (int card: poker) {
			System.out.println(card);
		}
		System.out.println("-------");
		//System.out.println(System.currentTimeMillis() - start);
		
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}

		for (int card: players[1]) {
			System.out.println(card);
		}
		
		
		
		
		
		
	}
}
