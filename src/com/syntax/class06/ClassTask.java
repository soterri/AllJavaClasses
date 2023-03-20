package com.syntax.class06;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {

		/*
		 * ask user to enter the month they were born based on the month define the
		 * season ex: march, april, may -> spring otherwise - season unknown at the end
		 * of the program - put "you were born in.."
		 */

		String month;
		Scanner scan = new Scanner(System.in);
		System.out.println("What month were you born in?");
		month = scan.nextLine();
		
		String season = null;

		if (month.equals("January") || month.equals("February")) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		} else if (month.equals("Sepetember") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		} else {
			System.out.println("unknown");
		}

		System.out.println("You were born in " + month + " and the season is " + season);
	}

}
