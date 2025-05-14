package com.syntax.class08;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		// create a program that will be asking user to apply for a CC 10x. As soon as
		// you get yes. program stops

		// print #s 1-50 divisible by 3

		for(int i=1; i<=50; i++) {
			
			if(i%3==0) {
				continue;
			}
			System.out.println(i);

		}
		String card;
		Scanner scan = new Scanner(System.in);

		for (int q = 1; q <= 10; q++) {
			System.out.println("apply for cc?");
			card = scan.nextLine();
			if (card.equals("yes")) {
				break;
			}

		}

	}

}
