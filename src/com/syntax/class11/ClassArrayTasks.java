package com.syntax.class11;

public class ClassArrayTasks {
	public static void main(String[] args) {

		/*
		 * create an array of cars and store 6 elements into it. Using 2 different loops
		 * to print all values from the array
		 */

		String cars[] = { "Acura", "Tahoe", "Mercedes", "GMC", "Toyota", "Honda" };

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("****************");
		for (String caros : cars) {
			System.out.println(caros);
		}

		/*
		 * create an array of countries. While retrieving all values from an array print
		 * capital for each country using 2 diff loops
		 */

		String[] countries = { "USA", "Cambodia", "Laos", "Vietnam" };

		for (int j = 0; j < countries.length; j++) {

			if (countries[j].equals("USA")) {
				System.out.println("USA: Washington DC");
			} else if (countries[j].equals("Cambodia")) {
				System.out.println("Cambodia: Phnom Penh");
			} else if (countries[j].equals("Laos")) {
				System.out.println("Laos: Vientiane");
			} else if (countries[j].equals("Vietnam")) {
				System.out.println("Vietnam: Saigon City");
			} else {
				System.out.println("unk");
			}

		}
	}
}
