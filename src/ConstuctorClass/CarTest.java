package ConstuctorClass;

public class CarTest {
	public static void main(String[] args) {

		Car.make = "Toyota"; // initializing the variable
		BetterCar.make="Lexus";

//		Car car1 = new Car();
//		car1.model = "Camry";
//		car1.color = "Black";
//		car1.speed=200;
//		car1.doors=4;
//		car1.getDetails();
//
//		Car car2 = new Car();
//		car2.model = "4Runner";
//		car2.color = "White";
//		car2.speed=200;
//		car2.doors=4;
//		car2.getDetails();
		
//		Car betterCar = new Car("Highlander", "Gray", 400, 4);
//		betterCar.getDetails();
		BetterCar betterCar = new BetterCar("Corolla", "White", 180, 5);
		betterCar.getDetails();
		
		Car betterCar1 = new Car("Camry", "Black", 200, 4);
		betterCar1.getDetails();
		
		
	}
}

