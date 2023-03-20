package com.syntax.class04;

public class NestedIfPractice {
	public static void main(String[] args) {

		boolean isFriday = false;
		int day = 13;

		if (isFriday) {
			System.out.println("Today is Friday");

			if (day == 122) {
				System.out.println("I will not watch a scary movie, I fucking hate scary movies");
			}
		} else {
			System.out.println("Today is NOT Friday");

		}

	}
}
