package tw.org.iii.myclasses;

public class BikeV2 extends Bike {
	private int gear;	// 0
	
	public BikeV2() {
		// super();
		super("Green");
		gear = 1;
	}
	
	public void addGear() {
		if (gear < 3) gear++;
	}
	public void minusGear() {
		if (gear > 1) gear--;
	}
	
	// Override
	public void upSpeed() {
//		super.upSpeed();
//		speed *= gear;
		speed = speed <1 ? 1 : speed*1.2*gear;
	}
	
}
