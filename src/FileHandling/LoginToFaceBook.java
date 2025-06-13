package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PolymorphismOLandOR.FireFoxDriver;

public class LoginToFaceBook {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "\\configurations.properties";
				//"\\configs\\configurations.properties";// always defines
																									// location where
																									// java starts
																									// execution
		// System.out.println(filePath);

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();
		prop.load(fis);

		String browser = prop.getProperty("browser");

		//WebDriver driver;
		
		switch (browser) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver = new FirefoxDriver();
			break;
		}

		driver.get(prop.getProperty("url"));
		
		
		//FileOutputStream fos = new FileOutputStream(filePath);
		//prop.store(fos, "logging in?");
	}

}
