package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserTask {
	
	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\JohnN\\eclipse-workspace\\JavaClasses\\Browsertask.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		FileOutputStream fos = new FileOutputStream(filePath);
		prop.store(fos, "add commentss");
		
	}

}
