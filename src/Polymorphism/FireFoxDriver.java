package Polymorphism;

public class FireFoxDriver extends WebDriver{
	@Override
	public void open() {
		System.out.println("Opening firefox browser");
	}
	public void getTitle() {
		System.out.println("Getting title");
	}

}
