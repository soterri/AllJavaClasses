package com.syntax.class07;

public class WhileLoop {
	public static void main(String[] args) {

		int time = 8; // declaring variable and assigning value

		if (time < 12) { // condition is true
			System.out.println("Good Morning*"); // code executes 1
		}

		while (time < 12) {
			System.out.println("Good Morning"); // code executes infinitely. infinite loop. for it to stop we need to
												// add increment or decrement operator

			time++;
		}

//I want to print Hello 5x

		int hello = 1;// declare and initialize variable

		while (hello < 6) { //test variable
			System.out.println("Hello");
			hello++; //increment
		}

		int gm = 1;

		while (gm <= 5) {
			System.out.println("Good morning");
			gm++;
		}
		
		int khmer = 1;
		
		while(khmer<5) {
			System.out.println("khmer");
			khmer++;
		}
		
		int sophy = 1;
		while(sophy<6) {
			System.out.println("Sophy is so cool");
			sophy++;
		}

		int gmm = 1;

		do {
			System.out.println("gm");
			gmm++;

		} while (gmm <= 5);

	}

}
