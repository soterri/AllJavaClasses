package AbstractionAndInterface;

public abstract class Vehicle {

	String vinNumber;
	static int totalVehicles;

	Vehicle(String vinNumber) {
		this.vinNumber = vinNumber;
		totalVehicles++;

	}

	// implemented methods
	public void drive() {
		System.out.println("Vehicle can drive");
	}

	public void stop() {
		System.out.println("Car can stop");
	}

	public static void displayTotal() {
		System.out.println("total cars we built "+totalVehicles
				);
	}
	// un-implemented methods
	public abstract void start();

	public abstract void speed();

}

abstract class Car extends Vehicle {

	String carType;

	Car(String vinNumber, String carType) {
		super(vinNumber);
		this.carType = carType;

	}

	public abstract void breaking();
}

class BMW extends Car {

	String make, model;

	BMW(String vinNumber, String carType, String make, String model) {
		super(vinNumber, carType);
		this.make = make;
		this.model = model;

	}

	@Override
	public void breaking() {
		System.out.println("BMW can break");

	}

	@Override
	public void start() {
		System.out.println("BMW starts remote");

	}

	@Override
	public void speed() {
		System.out.println("BMW can speed");

	}
	public void display() {
		System.out.println("We built "+make+" "+model+" with vin # "+vinNumber);
	}

}
