package com.syntax.class07;

public class IncrementAndDecrement {
	public static void main (String[] args) {
		
		int a =10;
		
		a=a+1; //assignment
		a+=1; //shorthand assignment
		
		System.out.println(a); //will be 12 bc it's adding 10+1+1
		a++; //increment operator
		System.out.println(a); //will be 13 bc incrementing
		
		int b = 10;
		b-=1;
		b--;
		System.out.println(b);
		
		int c = 23;
		c++;
		System.out.println(c);
		
		//increment and decrement operators can only be used with variables
		
	}

}
