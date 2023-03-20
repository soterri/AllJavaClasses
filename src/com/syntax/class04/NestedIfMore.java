package com.syntax.class04;

public class NestedIfMore {

	public static void main(String[] args) {
		
		/*check age, if age is less than 16 - you are too young to drive
		 * if older than you're eligible to drive
		 * otherwise - we will check if you are older than 18
		 * you can get DL if not you can get permit
		 * 
		 */
		
		int age = 18;
		
		if(age<16) {
			System.out.println("You're too young to drive");
		}else {
			System.out.println("You're old enough to drive");
			
			if(age<=15) {
				System.out.println("You can drive alone");
			}else {
				System.out.println("You need your parents to drive");
			}
		}

	}

}
