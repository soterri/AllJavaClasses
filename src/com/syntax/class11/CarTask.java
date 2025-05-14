package com.syntax.class11;

public class CarTask {
	
	public static void main(String[] args) {
		
		String[][] cars = {
				
				{"Honda","Hyundai","Toyota"},
				{"Tahoe","Chevrolet","Chevy"},
				{"Mercedes","Benz","Porsche"}
		};
		
		for(int i=0; i<cars.length; i++) {
			
			for(int j=0; j<cars[i].length; j++) {
				System.out.println(cars[i][j]+" ");
			}
			System.out.println();
		}
	}

}

