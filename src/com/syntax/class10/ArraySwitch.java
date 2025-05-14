package com.syntax.class10;

public class ArraySwitch {

	public static void main(String[] args) {
		
		String[] countries = { "USA", "Cambodia", "Laos", "Vietnam", "Thailand", "Malaysia" };
		
		for(int i=0; i<countries.length; i++) {
			
			switch(countries[i]) {
			
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
			case "Thailand":
				System.out.println("Bangkok");
				break;
			case "Malaysia":
				System.out.println("Kuala Lampur");
				break;
			default:
				System.out.println("Idk?");
			}
		}
	}
}
