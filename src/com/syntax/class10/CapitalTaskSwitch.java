package com.syntax.class10;

public class CapitalTaskSwitch {
	public static void main(String[] args) {

		String[] countries = { "Cambodia", "Laos", "USA", "Vietnam" };
		
		for (int i = 0; i < countries.length; i++) {

			switch (countries[i]) {
			
			case "Cambodia":
				System.out.println("Phnom Penh");
				break;
			
			case "Laos":
				System.out.println("Vientiane");
				break;
			case "USA": 
				System.out.println("Washington DC");
				break;
			case "Vietnam":
				System.out.println("Saigon City");
				break;

			}

		}

	}

}
