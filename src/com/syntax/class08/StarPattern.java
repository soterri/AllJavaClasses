package com.syntax.class08;

public class StarPattern {
	public static void main(String[] args) {
		
		for (int i=1; i<6; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=1; a<10; a++) {
			
			for(int b=1; b<=a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
