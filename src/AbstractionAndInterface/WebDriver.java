package AbstractionAndInterface;


interface takesScreenshot{
	//public static final
	String $FILE_EXTENSION=".png";
	void takesScreen();
	//static and default only available for jdk java 1.8+
	static void takeSelfie() {//cant override this method bc its static
		System.out.println("defaultstatic method of takescreenshot interface");
	}
	default void takePictures() {
		System.out.println("default defined method of takescreenshot interface");
		
	}
}

interface Application{
	void applicationTest();
	
}
public interface WebDriver extends takesScreenshot{
	
	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
}

abstract class Browser {

	public abstract void refresh();
}

class ChromeDriver extends Browser implements WebDriver, Application  {

	@Override
	public void openBrowser() {
		System.out.println("Open Chrome browser");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Chrome browser");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize chrome browser");

	}

	@Override
	public void findElement() {
		System.out.println("Find element xpath");

	}

	@Override
	public void refresh() {
		System.out.println("Refresh Chrome browser");

	}

	@Override
	public void takesScreen() {
		System.out.println("Chrome takes screenshot");
	}


	@Override
	public void applicationTest() {
		System.out.println("Application test in chrome browser");
		
	}
}

class FireFoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Open FF browser");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Close FF browser");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize FF browser");

	}

	@Override
	public void findElement() {
		System.out.println("Find element xpath firefox");

	}

	@Override
	public void takesScreen() {
		System.out.println("FF takes screenshot");
		
	}

}
