package Inheritance;

public class Dog extends Animals{

	String breed;
	
	public void bark() {	
		System.out.println("All dogs bark");
	}
	public void displayInfo() {
		System.out.println("Dog is "+breed+" and it's a "+color+ " dog");
	}
}
