package com.syntax.class12;

public class StringManipulations2 {
	public static void main(String[] args) {
		
		
		String str = "Good Morning, students!";
		
		//contains -> checks for specific value in the string
		//if value is present -> true else -> false
		boolean contains = str.contains("Morning");
		System.out.println(contains);
		
		String present = "Welcome, Terri";
		boolean isThere= present.contains("Welcome,");
		System.out.println(isThere);
		
		//boolean flag = present.toLowerCase().contains(isThere);
		//System.out.println(flag);
		
		String str1 = "syntax";
		
		boolean startsWith = str1.startsWith("s");
		System.out.println(startsWith);
		
		boolean ends = str1.endsWith("x");
		System.out.println(ends);
		
		System.out.println("----isEmpty----");
		//String str2="I need a fucking job";
		String str2="vghgjh";
		boolean isEmpty = str2.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("-----CONCAT-----");
		String str3="ughhhh";
		String str4 = " i need a job!!!";
		System.out.println(str3.concat(str4));
		
		System.out.println("------------------");
		String expected = "Hello, Welcome to my shitshow of a life!";
		String actual = "Hello, Welcometo my shit show of a life!!  ";
		
		System.out.println(expected.equals(actual));
		
		actual=actual.trim();
		System.out.println(actual);
		
		
			
	}

}
