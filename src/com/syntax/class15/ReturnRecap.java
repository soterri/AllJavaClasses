package com.syntax.class15;

public class ReturnRecap {

	// create a mwthod that will return sum of 2 numbers
	int returnSum(int a, int b) {
		return a + b;

	}
	void returnNothing() {
		System.out.println("this returns nothing");
	}
	void sum1(int a, int b) {
		System.out.println(a+b);
	}
	boolean isEqual(int a, int b) {
		if(a==b) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ReturnRecap obj = new ReturnRecap();
		int sum = obj.returnSum(10, 20);
		System.out.println(sum);
		int result = sum/10;
		System.out.println(result);
		obj.returnNothing();
		obj.sum1(50, 60);
		boolean isEq=obj.isEqual(50, 10);
		System.out.println(isEq);
	}
}
