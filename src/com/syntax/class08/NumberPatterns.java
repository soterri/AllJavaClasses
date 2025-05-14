package com.syntax.class08;

public class NumberPatterns {
	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {

			for (int j = 1; j < 6; j++) {

				System.out.print(j);
			}
			System.out.println();
		}

		for (int l = 1; l < 6; l++) {

			for (int k = 1; k < 6; k++) {

				System.out.print(l);
			}
			System.out.println();

		}
		System.out.println("-----------------------");
		for (int t = 1; t < 6; t++) { // rows

			for (int s = 1; s < 10; s++) { // cols

				System.out.print(s);
			}
			System.out.println();
		}
		System.out.println("----------------");

		for (int a = 1; a <= 5; a++) { // can also do int a=1; a>=5; a--

			for (int b = 5; b >= 1; b--) {

				System.out.print(a);
			}
			System.out.println();
		}

		System.out.println("***********************");

		for (int i= 5; i>0; i--) {

			for (int j = 1; j<= 5; j++) {

				System.out.print(i);
			}
		
		System.out.println();
		}
	}
}
