package com.syntax.class15;

public class TestAllMethods {
	public static void main(String[] args) {

		// find the largest from 300 and 500
		// then identify is the largest number odd

		AllMethods obj = new AllMethods();
		int large = obj.findLargest(300, 500);
		System.out.println(large);
		boolean odd = obj.isOdd(large);
		System.out.println(odd);
		int sub = obj.sub(100, 50);
		System.out.println(sub);

		// call method weekDayName
		// if tues, weds, thurs, sat, sun
		// say I am learning java

		String day = obj.weekDayName(1);
		if (day.equals("Tuesday") || day.equals("Wednesday")
				|| (day.equals("Thursday") || day.equals("Saturday") || day.equals("Sunday"))) {

			System.out.println("I am learning Java");

		}else {
			System.out.println("SDLC");
		}

	}
}
