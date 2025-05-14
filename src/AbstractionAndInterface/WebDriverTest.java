package AbstractionAndInterface;


public class WebDriverTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.openBrowser();
		driver.closeBrowser();
		driver.maximizeWindow();
		driver.findElement();
		driver.takesScreen();
		
	}
}


	