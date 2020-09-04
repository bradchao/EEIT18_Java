package tw.org.iii.tutors;

public class PokerV2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] poker = new int[10];
		int rand;
		boolean isRepeat;
		for (int i=0; i<poker.length; i++) {
			do {
				rand = (int)(Math.random()*10);
				
				// 檢查機制
				isRepeat = false;
				for (int j=0;j<i; j++) {
					if (poker[j] == rand) {
						isRepeat = true;
						break;
					}
				}
			}while(isRepeat);
			
			poker[i] = rand;
			System.out.println(poker[i]);
			
		}
		System.out.println("-------");
		System.out.println(System.currentTimeMillis() - start);
	}
}
