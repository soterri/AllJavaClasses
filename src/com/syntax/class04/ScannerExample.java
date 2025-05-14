package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		//Scanner is a class in Java that will allow us to take an input from user. 
		//Makes our program more interactive.
		
		//Scanner scan = new Scanner(System.in); creating the obj of new Scanner and storing it in the scan variable
		
		/*netInt(); -> grabs numbers
		 * nextLine(); -> grabs Strings
		 * nextDouble() -> captures doubleValues
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number");
		int number = scan.nextInt();
		System.out.println("Enter numbered is: "+number);
		
		System.out.println("--------------------");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name");
		String name =input.nextLine();
		System.out.println("name is "+name);
		
	}

}
