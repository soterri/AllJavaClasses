package VariablesAndAccessModifiers;

public class StaticKeyword {
	
	//create a template for a phone
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	//return type, name, parameters
	static void displayGenInfo() {
		System.out.println("We are building "+brand+" with touch screen = "+touchScreen);
		
	}
	void displaySpecifications() {
		System.out.println("We built phone with "+memory+" GB and "+color);
		
	}
	public static void main(String[] args) {
	
		brand="iPHONE";
		touchScreen=true;
		
		StaticKeyword obj = new StaticKeyword();
		obj.color="Black";
		obj.memory=124;
		//accessing static methods in a static way
		displayGenInfo();
		obj.displaySpecifications();
		
		
	}
}
