package tw.org.iii.myclasses;

public class Bike extends Object{
	// 屬性, 方法
	protected double speed;
	private String color;
	
	public Bike() {
		// super();
		color = "Yellow";
	}
	public Bike(String color) {
		if (color!= null) {
			this.color = color;
		}else {
			color = "Yellow";
		}
	}
	
	public void upSpeed() {
		speed = speed <1 ? 1 : speed*1.2;
	}
	public void downSpeed() {
		speed = speed < 1? 0: speed*0.7;
	}
	
	public double getSpeed() {
		return speed;
	}
	public String getColor() {
		return color;
	}
	public void changeColor(String newColor) {
		if (newColor != null) {
			color = newColor;
		}
	}
}
