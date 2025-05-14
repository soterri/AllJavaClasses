package com.syntax.class04;

public class NestedIfPractice {
	public static void main(String[] args) {

		boolean isFriday = true;
		int day = 13;

		if (isFriday) {
			System.out.println("today is friday");

			if (day == 14) {
				System.out.println("Friday the 13th");
			}else {
				System.out.println("I will watch a comedy");
			}
		} else {
			System.out.println("It's not friday");
		}
	}
}

//boolean isFriday = false;
//int day = 13;
//
//if (isFriday) {
//	System.out.println("Today is Friday");
//
//	if (day == 122) {
//		System.out.println("I will not watch a scary movie, I fucking hate scary movies");
//	}
//} else {
//	System.out.println("Today is NOT Friday");
//
//}
//
