package Collections;

import java.util.ArrayList;
import java.util.List;

public class Drinks {

	public static void main(String[] args) {

		/*
		 * create an arraylist of drinks if any drink has letter a or e replace with
		 * water
		 */

		List<String> drinks = new ArrayList<>();
		drinks.add("Coke");
		drinks.add("fanta");
		drinks.add("juice");
		drinks.add("liquor");
		drinks.add("milk");

		drinks.set(0, "water");
		
		for(int i=0; i<drinks.size(); i++) {
			
			if(drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);
	}
	
}
