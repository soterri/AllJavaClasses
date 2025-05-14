package com.syntax.class10;

public class ArrayTaskkkkk {

	public static void main(String[] args) {

		String[] animals = { "cat", "dog", "horse", "dragon" };
		//int size = animals.length;

		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		
//			for (int i = 0; i < size; i++) {
//				System.out.println(animals[i]);
			
		}
		
		//create an array to store double values, print all in one line
		
		double[] dbl = {1.5,8.0,5.5,9.8,10.5};
		int dblSize = dbl.length;
		
		for(int j=0; j<dblSize; j++) {
			System.out.print(dbl[j]+" ");
		}
		

	}
}