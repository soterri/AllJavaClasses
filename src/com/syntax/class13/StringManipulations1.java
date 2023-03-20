package com.syntax.class13;

public class StringManipulations1 {

	public static void main(String[] args) {

		// toCharArray(); converts String to array of characters

		String str = "saturday";

		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
		System.out.println("for each loop");
		for(char c:array) {
			
			System.out.println(c);
		}
		System.out.println("printing in reverse");
//		for(int i=array.length-1; i>=0; i--) {
//			System.out.print(array[i]);
		
		for(int i=array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
	}
}
