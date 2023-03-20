package com.syntax.class03;

public class ShorthandOperators {
	
	public static void main (String[] args) {
		
		int num1 = 50;
		num1+=20;
		System.out.println(num1);
		
		num1-=30;
		System.out.println(num1);
		 
		//exercise: declare a variable and increase by 100 using shorthand operator
		
		int num2 = 50;
		num2+=100;
		System.out.println(num2);
		
		//declare a variable and decrease by 67
		int num3 = 100;
		num3-=67;
		System.out.println(num3);
		
		int cakePiece = 11;
		cakePiece/=4;
		System.out.println("Cakepiece = "+cakePiece);
		
	}

}
