package com.syntax.class13;

import java.util.Scanner;

public class SplitNames {

	/*
	 * write a program that reads two peoples first names and if theyre expecting a
	 * boy or girl based on the input - suggests a name for a baby
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String motherName, fatherName, gender, babyName;

		System.out.println("Please enter mother's name");
		motherName = scan.nextLine();

		System.out.println("Please enter father's name");
		fatherName = scan.nextLine();

		System.out.println("Boy or girl?");
		gender = scan.nextLine();

		if (gender.equalsIgnoreCase("boy")) {
			babyName = fatherName.substring(0, fatherName.length() / 2) + motherName.substring(motherName.length() / 2);
		} else if (gender.equalsIgnoreCase("girl")) {
			babyName = motherName.substring(0, motherName.length() / 2) + fatherName.substring(fatherName.length() / 2);
		} else {
			babyName = "no suggestion";

		}
		System.out.println(babyName.toLowerCase());

	}
}
