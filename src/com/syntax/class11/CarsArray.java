package com.syntax.class11;

public class CarsArray {
	public static void main(String[] args) {
		
		/*create an array of cars
		 * then retrieve all values
		 */
		
		String[][] cars = {
				
				{"GMC", "Yukon", "Tahoe" },
				{"Toyota", "Honda", "Acura"},
				{"Mercedes", "BMW", "Porchse"}
				
		};
		
		for(int i=0; i<cars.length; i++) {
			
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
	}

}
