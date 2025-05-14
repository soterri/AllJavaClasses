package Oops;

public class ObjectOfCarClass {
	
	public static void main(String[] args) {
		
		//to create an individual object from the object class syntax is:
		//ClassName anyvariable = new ClassName();
		
		Car car = new Car(); //creates new obj being assigned to variable
		car.color="Black";
		car.make="Acura";
		car.model="MDX";
		car.year=2023;
		car.wheels=4;
		car.windows=4;
		car.speed=100;
	
		
		//accessing behavior for 2nd object
		Car car1 = new Car();
		car1.make="Tesla";
		car1.color="White";
		car1.model="S";
		
		
		
		
		//adding behaviors to car
		car.drive();
		car.start();
		car.accelerate();
		car.closeWindow();
		
		car1.drive();
		car1.start();
		
		//print features of car
		System.out.println("I have a "+car.color+" "+car.make+" with the year "+car.year);
		
		
	}

}
