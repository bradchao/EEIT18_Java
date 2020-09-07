package tw.org.iii.tutors;

import tw.org.iii.myclasses.Bike;

public class Brad18 {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		Bike urBike = new Bike();
		myBike.upSpeed();myBike.upSpeed();myBike.upSpeed();
		myBike.downSpeed();
		
		urBike.upSpeed();urBike.upSpeed();urBike.downSpeed();
		
		System.out.println(myBike.speed);
		System.out.println(urBike.speed);
		
	}

}
