package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {
	public static void main(String[] args) throws IOException {

		/*
		 * to how to read file 1.have file 2.bring object of FileInputStream
		 */

		// 1. constructing a path to our file
		String filePath = "C:\\Users\\JohnN\\eclipse-workspace\\JavaClasses\\Examples.properties";

		// 2. creating a obj of fileinputstream
		FileInputStream fileInput = new FileInputStream(filePath);

		// to handle data from .properties file we need Property Class
		// so, build an object of property class

		// based on file type. there are different classes you will need to use in in ur
		// java program// diff type of Objects()
		// to handle properties file, we need properties class
		// once we build obj, we load data from input stream into object
		// to handle data from XL file, we need XSSFWorkbook class
		// handling Data from properties class
		Properties prop = new Properties();
		prop.load(fileInput);

		String name = prop.getProperty("name");
		System.out.println(name);

		String city = prop.getProperty("city");
		System.out.println(city);

		Set<Object> key = prop.keySet();
		for (Object k : key) {
			System.out.println(k);
		}

	}

}
