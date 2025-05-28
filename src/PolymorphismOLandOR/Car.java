package PolymorphismOLandOR;

public class Car {
	// instance variables
	String make, model;
	int year;

	// Constructor
	Car(String make, String model, int year) {
		this.make=make;
		this.model=model;
		this.year=year;
		System.out.println("Car constructor");
	}

	// methods
	public void display() {
		System.out.println("We built " + year + " " + make + " " + model);
	}
	public void start() {
		System.out.println("Car starts");
	}

	public static void main(String[] args) {

		Car car = new Car("BMW", "X5",2025 );
		//car.make = "Acura";
		//car.model = "TSX";
		car.year = 2023;
		car.display();

		Car []cars={new Tesla("x", "Tessie", 2025), new Mercedes("Benzy","Merci", 2025)};//storing multiple objs in one variable - arrays!
		for(Car c:cars) {
			c.start();
			c.display();
			System.out.println("------------------");
			
			for(int i=0; i<cars.length; i++) {
				cars[i].display();
				cars[i].start();
			}
		}
	}

}

class Tesla extends Car {

	boolean autoPilot;

	Tesla(String make, String model, int year) {
		super(make, model, year);
		System.out.println("Non argument child class constructor");
	}
}

class Mercedes extends Car {

	Mercedes(String make, String model, int year){
		super(make, model, year);
	}
	
	
}
