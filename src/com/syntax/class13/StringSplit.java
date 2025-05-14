package com.syntax.class13;

public class StringSplit {
	public static void main(String[] args) {
		
		String str = "Welcome to my shit show life!";
		String[] array = str.split("s");
		System.out.println(array.length);
		for(String subString:array) {
			System.out.println(subString);
		}
		
		System.out.println("------------------");
		for(int i=0;i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
