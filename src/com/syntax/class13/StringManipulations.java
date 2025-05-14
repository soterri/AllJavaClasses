package com.syntax.class13;

public class StringManipulations {
	public static void main(String[] args) {
		
		//replace() will replace old char/value with new/char/value
		
		String str = "I am a good tester#1!";
		String newStr = str.replace("a", "e");
		System.out.println(newStr);
		
		String newStr1= str.replace("good", "great");
		System.out.println(newStr1);
		
		String newStr2=str.replace("tester", "programmer");
		System.out.println(newStr2);
		
		String newStr3 = str.replace("Tester", "programmer");
		System.out.println(newStr3);
		
		String str4=str.replace("!", "?");
		System.out.println(str4);
		
		String str5=str.replace("1", "2");
		System.out.println(str5);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		String str1 = "1233HRHTHFgfgfgfg#%^*&(";
		String replacedNoNumbers=str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);
		
		System.out.println("**************************");
		String replacedNoCharacter = replacedNoNumbers.replaceAll("[A-Za-z]", "");
		System.out.println(replacedNoCharacter);
		
		System.out.println("-------------------");
		String replacedCharacters = replacedNoNumbers.replaceAll("[^A-Za-z]", "");
		System.out.println(replacedCharacters);
		
		String str2 = "Hello123";
		System.out.println(str2.replaceAll("[^0-9]", ""));
	}
}
