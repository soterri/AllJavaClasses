package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {

			// break keywords exits/breaks the loop
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");

		// continue - it will skip current iteration

		for (int i = 1; i <= 5; i++) {

			if (i == 2) {
				continue;
			}
			System.out.println(i);

		}
		System.out.println("Outside of loop");

		// print nums from 1 to 2o except 5,6,7
		for (int a = 1; a <= 20; a++) {

			if (a == 5 || a == 6 || a == 7) {
				continue;
			}
			System.out.println(a);
		}

	}
}
