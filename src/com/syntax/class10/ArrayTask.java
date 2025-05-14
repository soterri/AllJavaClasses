package com.syntax.class10;

public class ArrayTask {
	
	/*Create an array of chars and store grades into it
	 * A,B,C,D,E,F, then print grade B using 2 different ways of creating an array
	 */
	
	public static void main(String[] args) {
		
		char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for(int i=0; i<grades.length; i++) {
			System.out.print(grades[i]+" ");
			
		}
	
		int[] grade = new int[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		//for(int j=0; j<grade.length; j++) {
			//System.out.println(grade[j]);
		}
		
	}


