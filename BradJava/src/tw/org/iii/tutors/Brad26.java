package tw.org.iii.tutors;

public class Brad26 {
	public static void main(String[] args) {
		Monster1 m1 = new Monster1();
		Monster2 m2 = new Monster2();
		Boss b1 = new Boss();
		
		toBoyDie(b1);
	}
	
	static void toBoyDie(Monster monster) {
		monster.fireGoodBoy();
		System.out.println("OK");
	}
}

interface Monster {
	void fireGoodBoy();
}
class Monster1 implements Monster {
	public void fireGoodBoy() {
		System.out.println("Monster1:fire");
	}
}
class Monster2 implements Monster {
	public void fireGoodBoy() {
		System.out.println("Monster2:fire");
	}
}
class Boss implements Monster {
	public void fireGoodBoy() {
		System.out.println("Boss:fire");
	}
	
}

