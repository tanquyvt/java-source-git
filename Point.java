/**
 * Point.java
 */
package pkg.sample;

/**
 * @author Quy Nguyen
 *
 */

// Point class declaration represents an x-y coordinate pair
public class Point {

	private int x; // x part of coordinate pair
	private int y; // y part of coordinate pair

	// no-argument constructor
	public Point() {
		// implicit call to Object constructor occurs here
		System.out.println("Point no-argument constructor: " + this);
	}

	// constructor
	public Point(int xValue, int yValue) {
		// implicit call to Object constructor occurs here
		x = xValue; // no need for validation
		y = yValue; // no need for validation

		System.out.println("Point constructor: " + this);
	}

	// finalizer
	protected void finalize() {
		System.out.println("Point finalizer: " + this);
	}

	// set x in coordinate pair
	public void setX(int xValue) {
		x = xValue; // no need for validation
	}

	// set y in coordinate pair
	public void setY(int yValue) {
		y = yValue; // no need for validation
	}

	// return x from coordiante pair
	public int getX() {
		return x;
	}

	// return x from coordiante pair
	public int getY() {
		return y;
	}

	// return String representation of Point object
	public String toString() {
		return "[" + getX() + "," + getY() + "]";
	}

}
