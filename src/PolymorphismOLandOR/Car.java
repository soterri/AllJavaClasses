package PolymorphismOLandOR;

public class Car {
	// instance variables
	String make, model;
	int year;

	// Constructor
	Car(String make, String model) {
		this.make=make;
		this.model=model;
		System.out.println("Car constructor");
	}

	// methods
	public void display() {
		System.out.println("We built " + year + " " + make + " " + model);
	}

	public static void main(String[] args) {

		Car car = new Car("BMW", "X5");
		//car.make = "Acura";
		//car.model = "TSX";
		car.year = 2023;
		car.display();

		Tesla tesla = new Tesla("?", "?");

	}

}

class Tesla extends Car {

	boolean autoPilot;

	Tesla(String make, String model) {
		super(make, model);
		System.out.println("Non argument child class constructor");
	}
}

class Mercedes extends Car {

	Mercedes(String make, String model){
		super(make, model);
	}
	
	
}
