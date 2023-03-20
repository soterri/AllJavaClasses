package com.syntax.class06;

import java.util.Scanner;

public class QuizScores {
	public static void main(String[] args) {

		/*
		 * Write a program that will read 3 inputs of scores (quiz, midterm, and final
		 * scores) and determine the grade based on the following rules: if avg score >=
		 * 90 = A >=70 and <90 = B >=50 and <70 = C below 50 = F
		 */

		Scanner scan;
		int quiz, midTerm, finalScore, average; // variables of the same kind can be put into one line

		scan = new Scanner(System.in);
		System.out.println("Please enter quiz score");
		quiz = scan.nextInt();

		System.out.println("Please enter midterm score");
		midTerm = scan.nextInt();

		System.out.println("Please enter final score");
		finalScore = scan.nextInt();

		// will have to calculate avg score
		average = (quiz + midTerm + finalScore / 3);

		if (average >= 90) {
			System.out.println("A");
		} else if (average >= 70 && average < 90) {
			System.out.println("B");
		} else if (average >= 50 && average < 70) {
			System.out.println("C");
		} else if (average < 50) {
			System.out.println("F");
		} else {
			System.out.println("Unknown");
		}

	}

}
