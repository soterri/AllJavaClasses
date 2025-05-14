package Oops;

public class Car {

	// define attributes/features/variables
	String make, model, color;
	int year, wheels, windows, speed;

	// adding behavior/action --> represented in the form of methods

	void drive() {
		System.out.println("Car " + make + " can drive");
	}

	void start() {
		System.out.println("Car " + make + " can start");
	}

	void accelerate() {
		System.out.println("Car "+ make+" can accelerate");
	}
	void closeWindow() {
		System.out.println("Close car window");
	}
}