
package com.syntax.class04;

public class RecapOfIf {

	public static void main(String[] args) {

		int num = 40;
		num = 23;
		num = 90;
		num -= 110;
		num += 110;

		if (num > 0) {
			System.out.println(num + " is a + number");
		} else if (num == 0) {
			System.out.println("Value of num is " + num);
		} else {
			System.out.println(num + " is a - number");
		}
		
		//even or odd
		int i = 135; 
		
		if(i%2==0) {
			System.out.println(i+" is an even number");
		}else {
			System.out.println(i+ " is an odd number");
		}
		
		if(i%2!=0) {
			System.out.println(i+ " is an odd number");
		}else {
			System.out.println(i+" is an even number");
		}
	}

}

//int i = 137;
//
//if (i % 2 == 0) {
//	System.out.println(i + " is a even number");
//} else {
//	System.out.println(i + " is a negative number");
//}
//
//if (i % 2 != 0) {
//	System.out.println(i + " is a odd number");
//} else {
//	System.out.println(i + " is a even number");
//}