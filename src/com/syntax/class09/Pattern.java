package com.syntax.class09;

public class Pattern {
	public static void main(String[] args) {
		
		//***** -- rows
		//*****
		//*****
		//*****
		
		for(int i=0; i<5; i++) { //rows
			
			for(int y=0; y<7; y++) { //cols
				System.out.print("*");
			}
			System.out.println();
		}

		
		for(int k=1; k<5; k++) {
			
			for(int l=1; l<6; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		
		
	}
}
