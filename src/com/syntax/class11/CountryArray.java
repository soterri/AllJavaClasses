package com.syntax.class11;

public class CountryArray {
	public static void main(String[] args) {
		
		//create an array of countries. While retrieving all values from an array print capital for each country
		
		String[] countries = {"Cambodia", "Laos", "Vietnam"};
		
		for(int i=0; i<countries.length; i++) {
			
			if(countries[i].equals("Cambodia")) {
				System.out.println("Phnom Penh");
			}else {
				System.out.println(countries[i]);
			}
		}

		for(String country:countries) {
			System.out.println(country);
		}
	}
}
