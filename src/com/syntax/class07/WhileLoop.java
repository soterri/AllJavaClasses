package com.syntax.class07;

public class WhileLoop {
	public static void main(String[] args) {
		
		int time=8;
		
		if(time<12) { //condition is true
			System.out.println("Good Morning*"); //code executes 1
		}
		while(time<12) {
			System.out.println("Good Morning");
			time++;
		}
	
		//I want to print Hello 5x
		int hello = 5;
	
		while(hello<6) {
			System.out.println("hello");
			hello++;
		}
	}

}
