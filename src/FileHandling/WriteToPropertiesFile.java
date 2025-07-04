package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {
	public static void main(String[] args) throws IOException {
		
		//write into existing file and add values
		String filePath = "C:\\Users\\JohnN\\eclipse-workspace\\JavaClasses\\Examples.properties";
	
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		prop.setProperty("phoneNumber", "123456789");
		
		FileOutputStream fos = new FileOutputStream(filePath);
		prop.store(fos, "add comments");
		
		//to write into existing file, make sure to load data first 
		//and then make changes and then write to the file
		
		//if we not going to load data first -> previous values will be overwritten
		
	}

}
