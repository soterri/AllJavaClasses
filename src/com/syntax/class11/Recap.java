package com.syntax.class11;

public class Recap {
	public static void main(String[] args) {

		// array literal
		String[] names = { "Terri", "Ange", "Max", "Sophy", "Savannah" };
		// declaring creating variable a type of string array = initializing and
		// assigning size

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//retrieve values using: advanced for loop, for each loop, enhanced for loop

		for(String fam:names) { //inside bracket specify cols on right side - array (names) on L side put the type of array and give it any variable name
				System.out.println(fam);
				
		}
	}

}
