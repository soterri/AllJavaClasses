package com.syntax.class07;

import java.util.Scanner;

public class NestedIfScannerRelationalTask {
	public static void main(String[] args) {
		
		//find the largest number using nested if
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 numbers to see whats the largest");
		
		double no1 = scan.nextDouble();
		double no2 = scan.nextDouble();
		double no3 = scan.nextDouble();
		
		if(no1>no2) {
			if(no1>no3) {
				System.out.println("Largest # is "+no1);
			}
		}
	}

}
//note this is unfinished - go back to class 7 to finish the rest of the code