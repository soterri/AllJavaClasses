package com.syntax.class11;

public class Recap1 {
	public static void main(String[] args) {
		
		//lets create an array of names that will hold 6 elements and retrieve all values
		
		String[] names = new String[6];
		
		names[0]="Terri";
		names[1]="Ange";
		names[2]="Max";
		names[3]="Sophy";
		names[4]="Savannah";
		names[5]="Cameron";
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("-----advanced for loop----------");
		for(String famNames:names) {
			System.out.println(famNames);
		}
				
	}

}
