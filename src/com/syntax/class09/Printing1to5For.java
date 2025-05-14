package com.syntax.class09;

public class Printing1to5For {
	public static void main(String[] args) {

		for (int a = 5; a >= 1; a--) { // rows

			for (int b = 1; b <= a; b++) { // cols
				System.out.print(b);

			}
			System.out.println();
		}
	}

}
