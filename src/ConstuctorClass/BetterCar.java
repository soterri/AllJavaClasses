package ConstuctorClass;

public class BetterCar {

	static String make ;
	public String model;
	public String color;
	public int speed;
	public int doors;

	BetterCar(String carModel, String carColor, int carSpeed, int carDoors) {
		model = carModel;
		color = carColor;
		speed = carSpeed;
		doors = carDoors;
	}
	public static void main(String[] args) {
		make="BMW";
		BetterCar bcar1=new BetterCar("i5", "Black", 100, 4);
		bcar1.getDetails();
		BetterCar bcar2 = new BetterCar("x5", "Blue", 200, 4);
		bcar2.getDetails();
		
	}

	public void getDetails() {
		System.out.println("I built " + color + " " + make + " " + model);
		System.out.println("My car has " + doors + " doors and the speed is " + speed);

	}
	
	
}