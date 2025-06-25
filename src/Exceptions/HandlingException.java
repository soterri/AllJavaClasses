package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {

	public static void main(String[] args) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Catched InterruptedException");
		}

		System.out.println("Continue to next try block");
		String filePath = "";

		try {
			FileInputStream fis = new FileInputStream(filePath);
		} catch (FileNotFoundException fne) {
			System.out.println("Catched FileNotFoundException Exception");

		}
		System.out.println("continue to next try block");
		
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a/b); // new ArithmeticException();
			System.out.println("code inside try block");//this block will get ignored if exception occsurs
		}catch(Exception ae) {
			System.out.println("Catched ArithmeticException Exception");
		}
		System.out.println("End of program");
	}

}
