package com.syntax.class10;

public class ForAndArray {
	public static void main(String[] args) {
		
		String[] animals = {"Dog", "Cat", "Panda", "Elephant", "Cow"};
		int size = animals.length;
		
		for(int i=0; i<size; i++) {
			System.out.println(animals[i]);		
		}
		//create an array to store 5 double values and print it all within one line
		
		double[] duble = {1.01,2.05,6.36,5.45};
		int sizes=duble.length;
		
		for(int j=0; j<sizes; j++) {
			System.out.print(duble[j]+" ");
		}
	}

}
