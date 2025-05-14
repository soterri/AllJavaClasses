package com.syntax.class09;

public class StarPattern {

	public static void main(String[] args) {

		for(int i=5; i>=1; i--) {
			
			for(int y=1; y<=i; y++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
