package Map;

public class Car {

	// create a car class that will have variables, methods, and constructors
	// create a map that will hold car number and car objects

	String make, model;

	Car(String make, String model) {
		this.make = make;
		this.model = model;

	}
	public void display() {
		System.out.println(make+" and "+model);
	}

}
