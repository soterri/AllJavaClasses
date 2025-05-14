package com.syntax.class13;

public class Substring {
	public static void main(String[] args) {
		
		String str = "Today is Sunday Java Class";
		
		String newString=str.substring(5);
		System.out.println(newString);
		
		String sub=str.substring(0, 5);
		System.out.println(sub);
		
	    System.out.println(str.substring(0, 5));
	}

}
//subsstring gives another string from the current string