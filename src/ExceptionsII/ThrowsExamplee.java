package ExceptionsII;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExamplee {
	
	public static void main(String[] args) {
	
			multipleSleep();
			try {
				read("");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static void read(String filePath) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(filePath);
	}
	public static void multipleSleep() {
		try {
			sleep();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}

}
