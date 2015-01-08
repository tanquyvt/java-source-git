package pkg.sample;

//	Circle3.class
//	Circle3 class inherits from Point2 and has access to Point2
// 	protected members x and y.

public class Circle3 extends Point2 {

	// private int x;
	// private int y;
	private double radius; // Circle3's radius

	// no-argument constructor
	public Circle3() {

	}

	// constructor
	public Circle3(int xValue, int yValue, double radiusValue) {
		// implicit call to Point2 constructor occurs here
		x = xValue;
		y = yValue;
		setRadius(radiusValue);
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
		return "Center = [" + x + ", " + y + "]; Radius = " + radius;
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
