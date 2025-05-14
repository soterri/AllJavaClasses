package AbstractionAndInterface;

public class DrivableTest {
	
	public static void main(String[] args) {
		
		Drivable obj = new Toyota();
		obj.drive();
		//Drivable.DRIVE_FAST=false; //CE, final value cannot be reassigned
	}

}
