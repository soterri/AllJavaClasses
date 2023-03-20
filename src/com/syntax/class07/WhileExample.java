package com.syntax.class07;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {

		/*
		 * ask user to enter if its raining or not - true or false as long as there is
		 * rain lets tell user to take an umbrella if no rain -> you can go to the park
		 */

		Scanner scan = new Scanner(System.in);
		boolean isRain;

		do {
			System.out.println("Is it raining?");
			isRain = scan.nextBoolean();
			System.out.println("Take umbrella");

		} while (!isRain);
		System.out.println("Go to the park");
	}

}
