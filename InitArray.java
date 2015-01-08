package pkg.sample;

import javax.swing.*;

public class InitArray {

	public static void main(String[] args) {
		// // Declare new array with each element’s value
		int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
		String output = "Index\tValue\n";
		// append each array element's value to String output
		for (int counter = 0; counter < array.length; counter++) {
			output += counter + "\t" + array[counter] + "\n";
		}

		// System.out.println(output);
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, outputArea,
				"Initializing an Array with a Declaration",
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	}

}
