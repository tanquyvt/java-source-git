package pkg.sample;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Histogram {
	

	public static void main(String[] args) {
		int[] array = { 49, 3, 15, 7, 11, 9, 13, 5, 17, 1 };
		String output = "Element\tValue\tHistogram";
		// for each array element, output a bar in histogram
		for (int counter = 0; counter < array.length; counter++) {
			output += "\n" + counter + "\t" + array[counter] + "\t";
			// print bar of asterisks
			for (int stars = 0; stars < array[counter]; stars++) {
				output += "*";
			} // end inner for
		} // end outer for
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, outputArea,
				"Histogram Printing Program", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		{
			
		}
	}
	
}

class A {
	int a;
	int[] b = new int[10];
	
}
