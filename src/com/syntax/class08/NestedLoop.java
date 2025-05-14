package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {

		
		for(int i=0; i<=3; i++	) {
			System.out.println("OuterLoop");
			
			for(int j=0; j<=4; j++) {
				System.out.println("inner--Loop");
			}
		}
//		for (int i = 1; i <= 3; i++) {
//			System.out.println("I am the outer loop");
//
//			// inner loop
//			for (int q = 1; q <= 3; q++) {
//
//				System.out.println("I am inner loop");
//			}
//		}
//
//		for (int j = 1; j <= 2; j++) {
//			System.out.println("yooo");
//
//			for (int k = 1; k <= 2; k++) {
//				System.out.println("YOOOO");
//			}
//		}

	}
}