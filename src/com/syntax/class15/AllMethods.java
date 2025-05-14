package com.syntax.class15;

public class AllMethods {

	/*
	 * create methods to return value of sum, mult, div, sub
	 */

	int sum(int num1, int num2) {
		int add = num1 + num2;
		return add;
	}

	int sub(int num1, int num2) {
		int subtract = num1 - num2;
		return subtract;
	}

	int div(int num1, int num2) {
		int division = num1 / num2;
		return division;
	}

	int multiply(int num1, int num2) {
		int mult = num1 * num2;
		return mult;
	}
	//method to find largest number
	int findLargest(int num1, int num2) {

		int largest;

		if (num1 > num2) {
			largest = num1;
			;
		} else {
			largest = num2;
		}
		// System.out.println(largest);
		return largest;
	}
	
	
	//method to return whether number is odd
	
	boolean isOdd(int num) {
		
		boolean isOdd;
		
		if(num%2!=0) {
			isOdd=true;
		}else {
			isOdd=false;
		}
		return isOdd;
	}
	/**method will take a week day number and return a 
	 * weekday name
	 */
	
	String weekDayName(int weekDay) {
		String weekDayName;
		switch(weekDay) {
		
		case 1:
			weekDayName="Monday";
			break;
		case 2:
			weekDayName="Tuesday";
			break;
		case 3:
			weekDayName="Wednesday";
			break;
		case 4:
			weekDayName="Thursday";
			break;
		case 5:
			weekDayName="Friday";
			break;
		case 6:
			weekDayName="Saturday";
			break;
		case 7:
			weekDayName="Sunday";
			break;
		default:
			weekDayName="N/A";
		}
		return weekDayName;
	}
}
	