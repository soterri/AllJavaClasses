package com.syntax.class11;

public class Largest {
	public static void main(String[] args) {

		// create an array and find the largest number

		// create an array of integers
		int[] numbers = { 200, 50, 13, 499, 65 };

		// assume that our largest number is equal to 0
		int largest = numbers[0];

		// now loop
		for (int i = 0; i < numbers.length; i++) {
			// now comparing each element

			if (numbers[i] > largest) {
				largest = numbers[i];

			}
		}

		System.out.println("The largest number is " + largest);
	}
}
