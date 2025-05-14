package com.syntax.class15;

public class BuiltAndUserDefinedMethods {

	public static void main(String[] args) {
		//built in method --> replace
		String str = "Hello";
		str = str.replace("Hello", "Hi");
		System.out.println(str);
		
		//obj is a reference variable
		BuiltAndUserDefinedMethods obj = new BuiltAndUserDefinedMethods();
		obj.myMethod();
		
		
		
		
	}

	void myMethod() {
		System.out.println("This is user defined method that I created");
	}
}
