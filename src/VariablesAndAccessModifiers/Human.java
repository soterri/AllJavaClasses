package VariablesAndAccessModifiers;

public class Human {
	//instance variables
	String name;
	String lastName;
	
	//static/class variables
	static int eyes=2;
	static int nose=1;
	static boolean brain = true;
	
	public static void main(String[] args) {
		
		Human hu1 = new Human();
		hu1.name="terri";
		hu1.lastName="thach";
		System.out.println(hu1.eyes);
		System.out.println(hu1.nose);
		System.out.println(brain);
		
		Human hu2 = new Human();
		hu2.name="John";
		hu2.lastName="Meu";
		
		System.out.println(hu1.name+" "+hu1.lastName);
		
	}
}
