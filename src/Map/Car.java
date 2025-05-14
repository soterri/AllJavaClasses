package Map;

import java.util.LinkedHashMap;
import java.util.Map;

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
		//Map<Integer, Car> mapCar = new LinkedHashMap<>();
       //creating an obj of the class (new LinkedHashMap<>(); and assigning to the variable mapCar
	  //variable is of collection type and what type of objs we're storing (key is Integer, Value is of car type)