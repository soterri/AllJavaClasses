package com.syntax.class05;

public class LogialAnd {
	public static void main(String[] args) {

		/*
		 * if number is b/w 1-10 -> number is small 1st condition
		 * if number is b/w 10-100 -> number is medium 2nd condition
		 * if number is 100-1000 -> number is large 3rd condition
		 * any other number -> out of range
		 * mutiple conditions use else if statements?
		 */
		
		int num = 30000;

		if (num > 1 && num < 10) {
			System.out.println("Num is too small");
		} else if (num > 10 && num < 100) {
			System.out.println("num is medium");

		} else if (num > 100 && num < 1000) {
			System.out.println("num is large");
		} else {
			System.out.println("Number is out of range");
		}

	}

}

//int num = 2000;
////true AND false -> false
//if (num > 1 && num < 10) {
//	System.out.println("number is small");
//	//true AND false -> false
//} else if (num >= 10 && num < 100) {
//	System.out.println("Number is medium");
//	//true & true -> true
//} else if (num >= 100 && num < 1000) {
//	System.out.println("Number is large");
//}else {
//	System.out.println("Number is out of range");
