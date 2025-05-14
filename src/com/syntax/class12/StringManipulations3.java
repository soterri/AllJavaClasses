package com.syntax.class12;

public class StringManipulations3 {
	
	public static void main(String[] args) {
		
		String str = "students";
		
		char character=str.charAt(3);
		System.out.println(character);
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		String str1 = "Sunday";
		int index=str1.indexOf("n");
		System.out.println(index);
		
		String str2 = "Syntax Technologies";
		System.out.println(str2.indexOf("Syntax"));
	}

}
