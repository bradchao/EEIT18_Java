package tw.org.iii.tutors;

import tw.org.iii.myclasses.Bike;

public class Brad18 {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		Bike urBike = new Bike("Blue");
		myBike.upSpeed();myBike.upSpeed();myBike.upSpeed();
		myBike.downSpeed();
		
		urBike.upSpeed();urBike.upSpeed();urBike.downSpeed();
		
		System.out.println(myBike.getSpeed());
		System.out.println(urBike.getSpeed());

		while (myBike.getSpeed()<10) {
			myBike.upSpeed();
		}
//		for (;myBike.getSpeed()<10;) {
//			myBike.upSpeed();
//		}
		
		System.out.println(myBike.getSpeed());
		System.out.println(myBike.getColor());
		myBike.changeColor(null);
		System.out.println(myBike.getColor());
		
		
	}

}
