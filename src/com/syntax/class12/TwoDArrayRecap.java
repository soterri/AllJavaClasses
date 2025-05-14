package com.syntax.class12;

public class TwoDArrayRecap {

	public static void main(String[] args) {

		int[][] array = {

				{ 1, 2, 3 }, 
				{ 10, 20, 30 }, 
				{ 100, 200, 300 } };

						//how many total arrays
		for(int i=0; i<array.length; i++) {
			
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---------for each loop"
				+ "---------");
		//loop through each element inside 2D array 0> each element = array
		for(int[] arrayNum:array) {
			
			for(int numbers:arrayNum) {
				System.out.print(numbers+" ");
			}
			System.out.println();
		}

	}
}