package com.syntax.class15;

public class Task {

	// create a method that will take 2 parameters as a numbers and prints number is
	// larger

	void largerNumber(int firstNum, int secNum) {

		if (firstNum > secNum) {
			System.out.println("The larger number is " + firstNum);
		} else if (firstNum < secNum) {
			System.out.println("The larger number is " + secNum);
		} else {
			System.out.println("equal");
		}
	}

//	void largerNumber(int firstNum, int secNum) {
//
//		if (firstNum > secNum) {
//			System.out.println("The larger number is " + firstNum);
//		} else if (firstNum < secNum) {
//			System.out.println("The larger number is " + secNum);
//		} else {
//			System.out.println("equal");
//		}
//	}

//	void isPalindrome(String word) {
//		String reverse = "";
//		
//		for(int i=word.length()-1; i>=0; i--) {
//			reverse = reverse + word.charAt(i);
//		}
//		if(word.equals(reverse)) {
//			System.out.println("This is a palindrome");
//		}else {
//			System.out.println("It is not a palindrome");
//		}
//	}

	void isPalindrome(String word) {
		String reverse = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		if (word.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
	//create a method that will take a number and prints whether the number is even or odd
	void evenOrOddd(int number) {
		if (number % 2 == 0) {
			System.out.println("The number " + number + " is even");
		} else {
			System.out.println("The number " + number + " is odd");
		}
	}

	public static void main(String[] args) {

		Task obj = new Task();
		obj.largerNumber(10, 20);
		obj.largerNumber(500, 100);
		obj.isPalindrome("kaya");
		obj.evenOrOddd(15);
	}

}
