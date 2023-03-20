package com.syntax.class15;

public class RecapOfMethods1 {
	
	void sum(int num1, int num2) {
		int c = num1+num2;
		System.out.println("The sum of 2 numbers is "+c);
	}
	//create a method to say Hello 5x
	void sayHello(int times) {
		
		for(int i=0; i<times; i++) {
			System.out.println("Hello");
		}
	}
	void saySomething(String word, int times) {
		
		for(int j=0; j<times; j++) {
			System.out.println(word);
		}
	}
	public static void main(String[] args) {
		
		RecapOfMethods1 obj = new RecapOfMethods1();
		obj.sum(20, 20);
		obj.sayHello(10);
		obj.saySomething("hi", 5);
	}

}
