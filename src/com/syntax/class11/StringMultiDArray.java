package com.syntax.class11;

public class StringMultiDArray {
	public static void main(String[] args) {

		String[][] names = {

				{ "Chanthavong", "Sotheary", "Angelina", "Chanthavong Jr", "Sophy", "Savannah", "Cameron" },
				{ "John", "Terri", "Ange", "Max", "Soph", "Sav", "Cam"},
				{ "Mom", "Dad", "Daughter1", "Son", "Daughter2", "Daughter3", "Son2" },
				
		};

		System.out.println(names[0][1]);
		
		int rows = names.length;
		System.out.println(rows);
		
		int cols = names[0].length;
		System.out.println(cols);
		
		for(int row = 0; row<names.length; row++) { //.num.length is accessing the property of the length for our array will gives us # of rows/arrays
			
			for(int col=0; col<names[row].length; col++) { //inner loop thru cols
				
				System.out.print(names[row][col]+" ");
			}
			System.out.println();
		}

	}

}
