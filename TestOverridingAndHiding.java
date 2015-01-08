package pkg.sample;

public class TestOverridingAndHiding {

	public static void main(String[] args) {
		
		Sub1 sub1 = new Sub1();
		Super1 super1 = sub1;
		
		Super1.testClassMethod();
		super1.testInstanceMethod();

	}

}
