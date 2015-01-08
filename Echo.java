package pkg.sample;

import java.io.IOException;

class Echo {

	public static void main(String[] args) throws IOException {
		int ch;
		System.out.println("Enter some text: ");
		while ((ch = System.in.read()) != '\n') {//	Reads the next byte of data from the input stream
			System.out.println((char)ch);
		}
	}

}
