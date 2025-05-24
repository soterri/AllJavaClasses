package PolymorphismOLandOR;

public class WebDriverTest {
	public static void main(String[] args) {
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.open();
		chrome.refresh();
		
		System.out.println("---------------------");
		FireFoxDriver firefox = new FireFoxDriver();
		firefox.refresh();
		firefox.open();
		firefox.getTitle();
		
		System.out.println("============");
		WebDriver driver = new ChromeDriver();
		driver.open();
		driver.refresh();
		driver.open();
		
		System.out.println("****************");
		//creating a object of child class and given reference to the parent class
		WebDriver driver1 = new FireFoxDriver();
		driver1.open();
		driver1.refresh();
		//no access to child specific class thru parent type
		//get title
	}

}
