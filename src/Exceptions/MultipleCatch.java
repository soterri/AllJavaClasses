package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {

		String file = System.getProperty("user.dir") + "\\configs\\configurations.properties";

		try {
			FileInputStream fis = new FileInputStream(file);// new FileNotFoundException
			//fis.close(); closes the stream so it will jump to line 23, will get an IOexception
			Properties prop = new Properties();
			prop.load(fis);//new IOException
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		System.out.println("end of program");
	}
}
