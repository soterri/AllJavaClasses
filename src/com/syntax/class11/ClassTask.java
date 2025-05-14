package com.syntax.class11;

public class ClassTask {

	// create a 2D array where you will store the following values:
	// Mr, Mrs,Ms,Miss after storing the values print mrs. smith, mr. obama, ms.
	// jackson

	public static void main(String[] args) {

		String[][] title = {

				{ "Mr", "Mrs", "Ms", "Miss" }, 
				{ "Smith", "Obama", "Jackson", "Vandross" }

		};

		System.out.print(title[0][2] + " ");
		System.out.println(title[1][3]);
		
		System.out.print(title[0][0]+" ");
		System.out.println(title[1][1]);
	}
}