package PolymorphismOLandOR;

public class Car {
	// instance variables
	String make, model;
	int year;

	// Constructor
	Car() {
		System.out.println("Car constructor");
	}

	// methods
	public void display() {
		System.out.println("We built " + year + " " + make + " " + model);
	}

	public static void main(String[] args) {

		Car car = new Car();
		car.make = "Acura";
		car.model = "TSX";
		car.year = 2023;
		car.display();

		Tesla tesla = new Tesla();
		
	}

}
class Tesla extends Car{
	
	boolean autoPilot;
	
	Tesla(){
		System.out.println("Non argument child class constructor");
	}
}
