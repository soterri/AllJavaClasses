package ConstuctorClass;

public class Car {
	/*
	 * we want to build toyota cars that will have different models and color
	 */
	//static and instance variables/attributes
	static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	//constructor
	Car(String carModel, String carColor, int carSpeed, int carDoors){
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
		
		
	}
	//method/behavior
	public void getDetails() {
		System.out.println("I built " + color + " " + make + " " + model);
		System.out.println("My car has "+doors+" doors and the speed is "+speed);

	}

}
