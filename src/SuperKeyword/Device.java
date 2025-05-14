package SuperKeyword;

public class Device {

	// class device, then create a child class "Apple"

	String deviceType, name;

	// Initializing variable by constructor
	public Device(String deviceType, String name) {
		this.deviceType = deviceType;
		this.name = name;

	}

}
class Apple extends Device{

	public Apple(String deviceType, String name) {
		super(deviceType, name);
	
	}
	public void display() {
		System.out.println(deviceType+" "+name);
	}
	
}