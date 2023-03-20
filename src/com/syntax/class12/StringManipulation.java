package com.syntax.class12;

public class StringManipulation {
	public static void main(String[] args) {
		
		String str = "Syntax";
		
		int lengthOfString = str.length();
		System.out.println(lengthOfString);
		
		String str1 = "Syntax Technologies";
		int lengthOfString2 = str1.length();
		System.out.println(lengthOfString2);
		
		String str2 = "Welcome Students!";
		System.out.println(str2.length());
		
		String str3 = "Hello";
		String newstring = str3.toUpperCase();
		System.out.println(newstring);
		
		System.out.println(str3.toLowerCase());
		
		String str4= "hello";
		String str5 = "Hello";
		
		boolean equality = str4.equals(str5);
		System.out.println(equality);
		
		String expectedBrowser = "Chrome";
		String actualBrowser = "chrome";
		boolean browserEqual = expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(browserEqual);
		
		
		
		

	}

}
