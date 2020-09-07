package tw.org.iii.myclasses;

public class Bike {
	// 屬性, 方法
	public double speed;
	
	public void upSpeed() {
		speed = speed <1 ? 1 : speed*1.2;
	}
	public void downSpeed() {
		speed = speed < 1? 0: speed*0.7;
	}
}
