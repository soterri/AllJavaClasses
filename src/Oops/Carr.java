package Oops;

public class Carr {
	
	//inside this car class we will define features in forms of variables
	//and actions in form of methods
	
	//define feature of the car
	String make, model, color;
	int year, wheels;
	
	//define behavior
	void drive() {
		System.out.println(make+" and "+model+ " can drive");
	}
	void accelerate() {
		System.out.println(make+ " and "+model+ " "+year+ " can accelerate");
	}
	void brake() {
		System.out.println(make+ " will  brake");
	}
	void hi(String name) {
		System.out.println("Hello "+ name);
	}
	

}
