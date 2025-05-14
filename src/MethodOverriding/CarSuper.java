package MethodOverriding;

public class CarSuper {
	
	String make, model;
	int year;

	CarSuper(){
		System.out.println("I am a non argument constructor");
	}
	
	public void display() {
		System.out.println("I built "+year+" "+make+" "+model);
	}
	public static void main(String[] args) {
		
		CarSuper car = new CarSuper();
		car.display();
		
		
		
		System.out.println("---obj of child class----");
		Tesla tessie = new Tesla();
		
		
	}

}
class Tesla extends CarSuper{
	
	boolean autoPilot;

	Tesla(){
		super(); //refers to the immediate parent class 
		System.out.println("Child class non argument constructor");
	}
	
}
