package com.syntax.class15;

public class CreatingMethods {

	/*
	 * we want to create a method that will accept marks (90, 80)
	 * based on the marks it will return grade (a,b,c)
	 * if grade -> 90 A 80 -> B if grade less then 80 but more then 70 C and so on
	 */
	
	char getGrade(int a) {
		char grade;
		
		if(a>90) {
			grade = 'A';
		}else if(a <=90 && a>80) {
			grade = 'B';
		}else if(a<=80 && a>70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		return grade;
	}
	public static void main(String[] args) {
		
		CreatingMethods obj = new CreatingMethods();
		char grade=obj.getGrade(90);
		System.out.println(grade);
	}
}
