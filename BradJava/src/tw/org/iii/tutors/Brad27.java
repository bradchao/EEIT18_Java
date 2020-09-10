package tw.org.iii.tutors;

public class Brad27 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(3,4,5, 4);
		Triangle t2 = new Triangle(3,3,3, 7);
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(4);
		System.out.println(sumArea(t1,t2));
	}
	
	static double sumArea(Shape s1, Shape s2) {
		return s1.calArea() + s2.calArea();
	}
}

interface Shape {
	double calLength();
	double calArea();
}
class Triangle implements Shape {
	private double s1, s2, s3, h;
	public Triangle(double s1, double s2, double s3, double h) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.h = h;
	}
	public double calLength() {
		return s1 + s2 + s3;
	}
	public double calArea() {
		return s1*h/2;
	}
}

class Circle implements Shape {
	private double r;
	Circle(double r){this.r = r;}
	public double calLength() {
		return 2*Math.PI*r;
	}
	public double calArea() {
		return Math.PI *r * r;
	}
}
