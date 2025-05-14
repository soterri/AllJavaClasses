package com.syntax.class04;

public class IfElseRecap {

	public static void main(String[] args) {

		/*
		 * Class schedule if sdlc weds, java tues etc to implement multiple conditions
		 * use if else if
		 */

		int day = 8; //variable declaration and initialization

		if (day == 2) {
			System.out.println("I have SDLC Class");
		} else if (day == 3) {
			System.out.println("I have Java class");
		} else if (day == 4) {
			System.out.println("I have Review class");
		} else if (day == 6) {
			System.out.println("I have weekend Java Class");
		} else if (day == 7) {
			System.out.println("Java class");
		}else {
			System.out.println("No class");
		}

	}

}

//public static void main(String[] args) {
//
//	int day = 5;
//
//	if (day == 2) {
//		System.out.println("SDLC Class");
//	} else if (day == 3) {
//		System.out.println("Review Class");
//	} else if (day == 4) {
//		System.out.println("SLDC class");
//	} else if (day == 6) {
//		System.out.println("Java Class");
//	} else if (day == 7) {
//		System.out.println("Favorite Java Class");
//	} else {
//		System.out.println("There's no class");
//	}
//}