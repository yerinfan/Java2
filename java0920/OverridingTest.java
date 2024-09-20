package java0920;

public class OverridingTest {
	public static void main(String[] args) {
		Circle c = new Circle(5.0);
		System.out.println(">>> 원 : ");
		System.out.println("반지름 : " + c.getRadius());
		System.out.println("면적 : " + c.getArea());
		
		Ball b = new Ball(5.0);
		System.out.println("\n>>> 공 : ");
		System.out.println("반지름 : " + b.getRadius());
		System.out.println("면적 : " + b.getArea());
		
		Cylinder cyl = new Cylinder(5.0, 7.0);
		System.out.println("\n>>> 원기둥 : ");
		System.out.println("반지름 : " + cyl.getRadius());
		System.out.println("높이 : " + cyl.getHeight());
		System.out.println("면적 : " + cyl.getArea());
	}
}

class Circle {
	public final double PI = 3.14;
	private double r;
	
	public Circle(double radius) {
		this.r = radius;
	}
	
	public double getArea() {
		return r*r*PI;
	}
	
	public double getRadius() {
		return r;
	}
	
	public void setRadius(double radius) {
		this.r = radius;
	}
}

class Ball extends Circle{

	public Ball(double radius) {
		super(radius);
	}
	
	public double getArea() {
		double r = getRadius();
		return 4*PI*r*r;
	}

}

class Cylinder extends Circle {
	
	private double h;
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.h = height;
	}

	public double getHeight() {
		return h;
	}
	
	public void setHeight(double height) {
		this.h = height;
	}
	
	public double getArea() {
		double r = getRadius();
		return 2*PI*r*r + 2*PI*r*h;
	}
	
}


