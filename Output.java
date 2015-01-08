package pkg.sample;

class Output {

	public static void main(String[] args) {
		// Standard out
		System.out.print("Prints, but no newline");
		System.out.println("Prints, adds platform newline at end");
		double test = 4.6;
		System.out.println(test);
		System.out.println("What ab \f out formfeed character");
		System.out.println("You can use" + "the plus operator on" + test + "String mixed with numbers");
		System.out.println("trouble"+ 5 + 7);
		System.out.println("ok" + (5+7));
		System.out.flush(); //flushes output buffer
		System.err.println("Standard error output");

	}

}
