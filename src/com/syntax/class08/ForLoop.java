package com.syntax.class08;

public class ForLoop {
	public static void main(String[] args) {

		// say GM 5x
		// initialize test condition increment
		for (int i = 0; i <= 4; i++) {
			System.out.println("GM");

		}

		// print numbers from 1-10

		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}

		// print numbers from 10-1
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);

		}
		// increments of 5 from 50
		for (int i = 0; i <= 50; i += 5) {
			System.out.println(i);

		}
		// print numbers from 1-100 in one line
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		// print odd numbers from 20-50
		for (int i = 21; i >= 50; i += 2) {
			System.out.println(i);
		}
		// using modulus
		for (int i = 20; i <= 50; i++) {

			if (i % 2 == 1) {
				System.out.println(i + " modulus");
			}
		}
		int sum = 0;
		for (int i1 = 1; i1 <= 5; i1++) {
			sum = sum + i1;
		}
		System.out.println();
		System.out.println(sum);

		System.out.println("************");
		int sumAll = 0;

		for (int i = 0; i <= 20; i += 5) {
			sumAll = sumAll + i;

		}
		System.out.println(sumAll);
		
		int total =2;
		
		for(int y=1; y<=3; y++) {
			total = total*y; //2=2*1; 4=2*2; 12=4*3
		}
		System.out.println(total);
	}

}
