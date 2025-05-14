package com.syntax.class11;
 
public class MultidimensionalArray {
	public static void main(String[] args) {
		
		//creating a 2D array
		
		
		int[][] d = new int[3][4]; //storing 12 elements 3*4
		
		//1 row
		d[0][0]=12;
		d[0][1]=13;
		d[0][2]=14;
		d[0][3]=15;
		//2 row
		d[1][0]=1;
		d[1][1]=2;
		d[1][2]=3;
		d[1][3]=4;
		//3 row
		d[2][0]=5;
		d[2][1]=10;
		d[2][2]=15;
		d[2][3]=20;
		
		System.out.println(d[1][2]);
		
		/*declaring and initalizing a 2D array int[][] declares a 2D array of integers
		 * array C is structured as a table with 4 rows and 4 cols
		 * c.length gives the numbers of rows in the 2D array which is 4
		 * c[row].length gives the number of cols in a specific row, which is 4 in this case
		 * outer loop for(int row=0; row<c.length; row++) iterating through the rows
		 * inner loop (for col=0; col<c[row].length; col++) iterating through cols
		 * then print each element of the array accessing the elements at position c[row][col] and outputs it
		 */
		
		
		//2d literal
		int[][] c = {
				
				{12,13,14,15},
				{1,2,3,4},
				{5,10,15,20},
				{100,200,300,400}
		};
		System.out.println("----------");
		for(int row=0; row<c.length; row++) {
			
			for(int col=0; col<c[row].length; col++	) {
				System.out.print(c[row][col]+" ");
		}
		}
		//System.out.println(c[3][1]); //prints 200
		
	}

}

//2d array is array of an array