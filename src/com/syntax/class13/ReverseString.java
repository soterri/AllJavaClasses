package com.syntax.class13;

public class ReverseString {

	public static void main(String[] args) {

		String original = "Today is Java Class";
		String reverse = "";

		char[] array = original.toCharArray();

		for (int i = array.length - 1; i >= 0; i--) {
			reverse = reverse + array[i];
		}
		System.out.println(reverse);

		
		
		// charAt();
		String reverse1 = "";

		for (int j = original.length() - 1; j >= 0; j--) {
			reverse1 = reverse1 + original.charAt(j);

		}
		System.out.println(reverse1);
		
		//using substring
		
		String reverse3="";
		
		for(int i=original.length()-1; i>0; i--) {
			reverse3=reverse3+original.substring(i-1, i);
		}
		System.out.println(reverse3);
	}
}
