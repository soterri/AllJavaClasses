package com.syntax.class11;

public class ForEachLoop {

	public static void main(String[] args) {

		int[] numbers = { 13, 13, 14, 15, 16, 17 };

		for (int nums : numbers) {
			System.out.println(nums);
		}
		System.out.println("------------------------");
		String[] countries = { "USA", "Cambodia", "Laos", "Vietnam" };

		for (int j = 0; j < countries.length; j++) {

			if (countries[j].equals("USA")) {
				System.out.println("USA:Washington DC");
			} else if (countries[j].equals("Cambodia")) {
				System.out.println("Cambodia:Phnom Penh");
			} else if (countries[j].equals("Laos")) {
				System.out.println("Laos:Vientiane");
			} else if (countries[j].equals("Vietnam")) {
				System.out.println("Saigon City");
			} else {
				System.out.println(countries[j]);
			}
			
			
			
			String[] countriess = { "USA", "Cambodia", "Laos", "Vietnam" };

			for (String country : countriess) {
				// System.out.println(country);

				switch (country) {

				case "USA":
					System.out.println("Washington DC");
					break;
				case "Cambodia":
					System.out.println("Phnom Penh");
					break;
				case "Laos":
					System.out.println("Vientiane");
					break;
				case "Vietnam":
					System.out.println("Saigon City");
					break;
				default:
					System.out.println("unknown");
				}
			}

		}

	}

}
