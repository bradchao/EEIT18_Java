package tw.org.iii.tutors;

public class Brad23 {
	public static void main(String[] args) {
		Brad233 obj1 = new Brad233();
		Brad231 obj2 = new Brad233();
		Brad232 obj3 = new Brad233();
		obj1.m1();
		obj2.m1();
		obj3.m3();
		Brad231 obj4 = new Brad231() {
			@Override
			public void m2() {
				
			}
			
			@Override
			public void m1() {
				
			}
		};
		Brad233 obj5 = (Brad233)obj2;
		obj5.m3();
	}
}

interface Brad231 {
	void m1();
	void m2();
}
interface Brad232 {
	void m3();
	void m4();
}
class Brad233 implements Brad231, Brad232 {

	public void m1() {
		System.out.println("Brad233:m1()");
	}

	public void m2() {
		System.out.println("Brad233:m2()");
	}

	public void m3() {
		System.out.println("Brad233:m3()");
	}

	public void m4() {
		System.out.println("Brad233:m4()");
	}
	
}

