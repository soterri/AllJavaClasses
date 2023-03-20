package com.syntax.class14;

public class ObjectOfCarClass {
	
	public static void main(String[] args) {
		
		//to create an object syntax is:
		//ClassName variable = new ClassName();
		
		Car car = new Car();
		car.color="Black";
		car.make="Acura";
		car.model="MDX";
		car.year=2023;
		car.wheels=4;
		car.windows=4;
		car.speed=100;
		
		//adding behaviors to car
		car.drive();
		car.start();
		car.accelerate();
		
		//print features of car
		System.out.println("I have a "+car.color+" "+car.make+" with the year "+car.year);
		
		
	}

}
