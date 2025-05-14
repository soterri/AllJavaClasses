package Oops;

public class Garage {
	public static void main(String[] args) {

		//building individual objects
		Carr car1 = new Carr();
		car1.make="Honda";
		car1.model="Accord";
		car1.wheels=4;
		car1.year=2025;
		car1.color="Yellow";
		car1.brake();
		car1.drive();
		car1.accelerate();
		car1.hi("Terri");
		
		
		
	}
}
