package com.syntax.class05;

public class LogicalOr {
	public static void main(String[] args) {
		/*
		 * 7 days a week if day is = to 2 or 4 = sdlc 
		 * 6 or 7 - java class 
		 * 1 or 5 no class 
		 * 3 = review class
		 */
		
		
		int day = 2;

		if (day == 2 || day == 4) {
			System.out.println("SDLC");
		} else if (day == 6 || day == 7) {
			System.out.println("Java class");
		} else if (day == 1 || day == 5) {
			System.out.println("No class");
		} else if (day == 3) {

			System.out.println("Review");
		} else {
			System.out.println("error");
		}

		String weekDay = "Saturday";

		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC Class");
		} else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java Class");
		} else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No class");
		} else if (weekDay.equals("Wednesday")) {
			System.out.println("Review Class");
		} else {
			System.out.println("Not a day for Syntax classes");
		}
	}

}
