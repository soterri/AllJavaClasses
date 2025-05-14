package com.syntax.class07;

public class DoWhile {
	public static void main(String[] args) {

		int num = 1;

		while (num <= 7) {
			System.out.println("Hello");
			num++;

			// WHILE LOOP

		}
		int num2 = 1;

		do {
			System.out.println("Bye");
			num2++;
		} while (num2 <= 7);

		// print even numbers from 20 to 50 using do while

//		int even = 20;
//		
//		do {
//			System.out.println(even);
//			even+=2;
//		}while(even<=50);
//		
		
		
		int even = 20;
		
		do {
			System.out.println(even);
			even+=2;
		}while(even<=50);
		
		
		// 2 using modulus
		System.out.println("****************");
		int even1=20;
		do {
			
			if(even1%2==0) {
			System.out.println(even1);
			
			}
		even1++;
	}while(even1<=50);

}

}
