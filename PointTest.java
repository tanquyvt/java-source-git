package pkg.sample;

import javax.swing.JOptionPane;

public class PointTest {

	public static void main(String[] args) {

		Point point = new Point(72, 115); // create Point object

		// get point coordinate
		String output = "X coordinate is " + point.getX() + "\n"
				+ "Y coordinate is " + point.getY();

		point.setX(10); // set x-coordiante
		point.setY(20); // set y-coordiante

		// get String representation of new point value
		output += "\n\nThe new location of point is " + point;

		// System.out.println(output); // just print output to console

		JOptionPane.showMessageDialog(null, output); // display output
		
		System.exit(0);

	}

}
