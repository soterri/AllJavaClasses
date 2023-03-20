package com.syntax.class11;

public class StringMultiDArray {
	public static void main(String[] args) {

		String[][] names = {

				{ "Chanthavong", "Sotheary", "Angelina", "Chanthavong Jr", "Sophy", "Savannah" },
				{ "John", "Terri", "Ange", "Max", "Soph", "Sav" },
				{ "Mom", "Dad", "Daughter1", "Son", "Daughter2", "Daughter3" },
				
		};

		System.out.println(names[0][1]);
		
		int rows = names.length;
		System.out.println(rows);
		
		int cols = names[0].length;
		System.out.println(cols);
		
		for(int row = 0; row<names.length; row++) {
			
			for(int col=0; col<names[row].length; col++) {
				
				System.out.println(names[row][col]);
			}
		}

	}

}
