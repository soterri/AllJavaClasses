package com.syntax.class11;

public class FoodArray {

	public static void main(String[] args) {

		String[][] food = { 
				{ "burger", "fries", "chinese" }, //1st array/1st row
				{ "cake", "banh mi", "salamachu" },
				{"papaya", "kua mee", "kapoon"}
		};
		
		//outer loop - loops thru rows
		for(int row=0; row<food.length; row++) {
	
		for(int col=0; col<food[row].length; col++) {
			System.out.println(food[row][col]);
			
				
			}
			System.out.println();
		}

	}
}
//for(int i=0; i<food.length; i++) {
//	
//	for(int j=0; j<food[i].length; j++) {
//		System.out.print(food[i][j]+" ");