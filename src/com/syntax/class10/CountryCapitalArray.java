package com.syntax.class10;

public class CountryCapitalArray {
	/*
	 * create an array of countries while retrieving all values from an array print
	 * capital for each country
	 */

	public static void main(String[] args) {

		String[] countries = { "USA", "Cambodia", "Laos", "Vietnam", "Thailand", "Malaysia" };

		for (int i = 0; i < countries.length; i++) {

			if (countries[i].equals("USA")) {
				System.out.println("Washington DC");
			} else if (countries[i].equals("Cambodia")) {
				System.out.println("Phnom Penh");
			} else if (countries[i].equals("Laos")) {
				System.out.println("Vientiane");
			}else {
				System.out.println(countries[i]);
			}
		}
	}

}
