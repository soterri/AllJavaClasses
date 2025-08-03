package com.syntax.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;

	public static void setUp() {

		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		switch(ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			WebDriver driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
			WebDriver driver1 = new FirefoxDriver();
			break;
			default:
				throw new RuntimeException("Browser is not supported");
		}
		
		driver.get(ConfigsReader.getProperty("url"));
	}
	public static void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
}
