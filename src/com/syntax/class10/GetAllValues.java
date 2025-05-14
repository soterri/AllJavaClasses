package com.syntax.class10;

public class GetAllValues {

	public static void main(String[] args) {

		// I want to print all values from an array
		// when value is Dog -> i love dogs

		String[] animals = { "Cat", "Dog", "Cow", "Snake", "Elephant" };

		for(int i=0; i<animals.length; i++) {
			
			if(animals[i].equals("Dog")) {
				System.out.println("I love Koda");
			}else {
				System.out.println(animals[i]);
			}
		}
		
	}

}
