package pkg.sample;

//	Circle.class
//	Circle class contain x-y coordinate pair and radius

public class Circle extends Point {

	// private int x; // x-coordinate of Circle's center
	// private int y; // y-coordinate of Circle's center
	private double radius; // Circle's radius

	// no-argument constructor
	public Circle() {
		System.out.println("Circle no-argument constructor: " + this);
	}

	// constructor
	public Circle(int xValue, int yValue, double radiusValue) {
		// x = xValue;
		// y = yValue;
		super(xValue, yValue);
		setRadius(radiusValue);

		System.out.println("Circle constructor: " + this);
	}

	// finalizer
	protected void finalize() {
		System.out.println("Circle finalizer: " + this);

		super.finalize(); // call superclass finalize method
	}

	// public void setX(int xValue) {
	// x = xValue;
	// }
	//
	// public void setY(int yValue) {
	// y = yValue;
	// }

	public void setRadius(double radiusValue) {
		radius = (radiusValue < 0.0 ? 0.0 : radiusValue);
	}

	// public int getX() {
	// return x;
	// }
	//
	// public int getY() {
	// return y;
	// }

	public double getRadius() {
		return radius;
	}

	// calculate and return diameter
	public double getDiameter() {
		return radius * 2;
	}

	// calculate and return diameter
	public double getCircumference() {
		return Math.PI * getDiameter();
	}

	// calculate and return area
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public String toString() {
		return "Center = " + super.toString() + "; Radius = " + getRadius();
	}
}

// public class Circle extends Shape {
//
// public Circle(String color) {
// super(color);
// }
//
// @Override
// public String draw() {
// return "I'm a " + this.getColor() + " circle.";
// }
//
// }
