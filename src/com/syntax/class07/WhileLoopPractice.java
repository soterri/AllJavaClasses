package com.syntax.class07;

public class WhileLoopPractice {
	public static void main(String[] args) {

		// how to print numbers from 1-20;

		int i = 1; // initialize the variables

		while (i <= 20) { // test the condition
			System.out.println(i); // code gets executed
			i++; // increment

		}
		// print 10 to 30 in one line

		int j = 10;
		while (j <= 30) {
			System.out.print(j + " ");
			j++;
		}

		// print values 10-1
//		int y = 10;
//
//		while (y >= 1) {
//			System.out.println(y);
//			y--;
		System.out.println("----------------------------");
		int y = 10;

		while (y >= 1) {
			System.out.println(y);
			y--;
		}

		// print values from 50 to 20
		System.out.println("************");
		int a = 50;

		while (a >= 20) {
			System.out.println(a);
			a--;

		}
		// print even numbers from 1-20
		System.out.println("Even numbers");
		int s = 2;

		while (s <= 20) {
			System.out.println(s);
			s += 2;

		}
		System.out.println("Using Modulus");

		int q = 1;

		while (q <= 20) {

			if (q % 2 == 0) {
				System.out.println(q);
			}
			q++;
		}

//		int q = 1;
//		
//		while(q<=20) {
//			
//			if(q%2==0) {
//				System.out.println(q);
//			}
//			q++;
//			
//		}
	}

}