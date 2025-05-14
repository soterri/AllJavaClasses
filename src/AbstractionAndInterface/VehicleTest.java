package AbstractionAndInterface;

public class VehicleTest {
	
	public static void main(String[] args) {
		
		//Car car = new BMW("12345", "BMW", "x5", "model");
		BMW bmw = new BMW("12345", "BMW", "x5", "model");
		
		//comes from vehicle class
		bmw.drive();
		bmw.stop();
		bmw.speed();
		bmw.start();
		//comes from car class
		bmw.breaking();
		//comes from bmw
		bmw.display();
		
		Car car = new BMW("1546431", "sedan", "bmw", "x5");
		//comes from vehicle class
		car.drive();
		car.stop();
		car.speed();
		car.start();
		//comes from car class
		car.breaking();
		//comes from bmw - wont be available to the parent
		//car.displayTotal();
		
		Vehicle vehicle = new BMW("5454", "45454jjb", "2154", "545454");
		vehicle.drive();
		vehicle.speed();
		vehicle.start();
		vehicle.stop();
		
		BMW.displayTotal();
	
	}

}
