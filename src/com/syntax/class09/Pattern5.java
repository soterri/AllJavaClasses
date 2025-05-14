package com.syntax.class09;

public class Pattern5 {

	public static void main(String[] args) {

		// print pattern 55555,4444,333,22,1

		for (int i = 5; i >= 1; i--) { // rows

			for (int j = 1; j <= i; j++) { // cols
				System.out.print(j);

			}
			System.out.println();

		}
	}
}
