package tw.org.iii.tutors;

import tw.org.iii.myclasses.BikeV2;

public class Brad21 {

	public static void main(String[] args) {
		BikeV2 b1 = new BikeV2();
		b1.addGear();
		b1.addGear();
		b1.addGear();
		b1.upSpeed();b1.upSpeed();b1.downSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(b1.getColor());
	}

}
