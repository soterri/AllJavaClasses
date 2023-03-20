package com.syntax.class14;

public class Car {

	// define attributes/features - variables
	String make, model, color;
	int year, wheels, windows, speed;

	// adding behavior/action --> methods

	void drive() {
		System.out.println("Car " + make + " can drive");
	}

	void start() {
		System.out.println("Car " + make + " can start");
	}

	void accelerate() {
		System.out.println("Car "+ make+" can accelerate");
	}
}