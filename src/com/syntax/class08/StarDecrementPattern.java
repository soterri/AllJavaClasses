package com.syntax.class08;

public class StarDecrementPattern {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			
			for(int y=1; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=4; a>=1; a--) {
			
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
