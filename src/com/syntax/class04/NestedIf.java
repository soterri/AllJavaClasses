package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

//		boolean b = false;
//		boolean classToday = true;
//		
//		if(b) {
//			System.out.println("I have class today");
//			
//			if(classToday) {
//				System.out.println("Java class");
//			}
//		}else {
//			System.out.println("Byeee");
//		}

		boolean b = true;
		boolean classToday =true;

		if (b) {
			System.out.println("I have class today");

			if (classToday) {
				System.out.println("java class");

			}

		} else {
			System.out.println("Byeeee");
		}
		// an independent line of code
		System.out.println("Helloooo buh bye");
	}

}


