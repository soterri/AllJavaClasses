package PolymorphismOLandOR;

public class CanWeOverload {

	//can we overload a private method? yes
	
	private void methodOne() {
		System.out.println("I am a private method ");
	}
	private void methodOne(String str) {
		System.out.println("I am a private with a arguement "+str);
	}
	
	//can we overload a main method? - yes
	//can we overload a static method? - yes
	public static void main(String str) {
		System.out.println("Main method with String arg");
	}
	public static void main(String str, String[] arg) {
		System.out.println("I am a main method with 2 parameters");
		
	}
	public static void main(String[]args) {
		System.out.println("main method with string array");
		CanWeOverload.main("String");
		String[] array = {"A","B"};
		main("Hello", array);
		//do we need to create an obj? no bc its static method
	}
}
