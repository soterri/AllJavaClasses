package com.syntax.class07;

public class WhileLoopPracticeTask {

	public static void main(String[] args) {

		// print only odd numbers from 50 to 100

		int i = 51;

		while (i < 100) { // test the variable
			System.out.println(i); // code get executed
			i += 2;

		}
		// print only even number from 1-100

		int y = 2;

		while (y <= 100) {
			System.out.println(y);
			y += 2;
		}
		System.out.println("----------------");
		int j = 2;

		while (j <= 100) {

			if (j % 2 == 0) {
				System.out.println(j);
			}
			j++;
		}
	}

}
