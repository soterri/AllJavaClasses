package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		// using ! - reverting condition
		
		boolean b1 = !true;
		boolean b2 = !false;
		
		System.out.println(b1); //false
		System.out.println(b2); //true
		
		boolean traffic = true;
		
		if(!traffic) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		
		boolean isRain = false;
		
		if(!isRain) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("Sunny dayz");
		}
		
		//comparing 2 numbers using NOT operator
		
		int num1=10;
		int num2 = 1;;
		
		if(num1==num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Numbers are not equal");
		}
		
		if(!(num1==num2)) {
			System.out.println("numbers are NOT equal");
			
		}else {
			System.out.println("Nums are equal");
		}
	}
}
