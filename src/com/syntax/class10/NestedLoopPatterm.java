package com.syntax.class10;

public class NestedLoopPatterm {
	public static void main(String[] args) {
		
		for(int a = 5; a>=1; a--) { //rows
			
			for(int b=1; b<=a; b++) { //cols
				
				System.out.println(b);
				
			}
			System.out.println();
		}
	}

}
