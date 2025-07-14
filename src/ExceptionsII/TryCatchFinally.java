package ExceptionsII;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally {

	public static void main(String[] args) {

		division(10, 0);
		
		TryCatchFinally.read("");
	}

	public static int division(int num, int num2) {

		int result = 0;

		try {
			result = num / num2;// new ArithmeticException
			// System.out.println(num/num2);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();// take the variable that refers to the obj of the arithmeticexception and can
									// call method printstacktrace
			// that will give us a detailed msg of our exception such as name of exception,
			// msg, and location of exception
			String message = ae.getMessage();
			System.out.println(message);
		} finally {
			System.out.println("finally block");
		}
		return result;

	}

	public static void read(String filePath) {
		FileInputStream fis=null;
		
		try {
			fis = new FileInputStream(filePath);
			Properties prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) {
				fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
