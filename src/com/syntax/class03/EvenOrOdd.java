package com.syntax.class03;

public class EvenOrOdd {

	public static void main(String[]args) {
		
		int i=135;
		
		if(i%2==0) {
			System.out.println(i+ " is an even number");
		}else {
			System.out.println(i+" is an odd number");
		}
		
		//2 using !=
		if(i%2!=0) {
			System.out.println(i+ " is an even number");
		}else {
			System.out.println(i+" is an odd number");
		}
	}
}
