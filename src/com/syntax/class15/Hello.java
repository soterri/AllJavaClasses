package com.syntax.class15;

public class Hello {

	void sayHello(String name) {
		System.out.println("Hello " + name);

	}

	void sayHelloDifferentLanguage(String country) {
		
		switch(country.toLowerCase()) {
		
		case "USA":
			System.out.println("Hello");
			break;
		case "cambodia":
			System.out.println("Sok Sa Bai");
			break;
		case "Laos":
			System.out.println("Sa bai dee");
			break;
		case "England":
			System.out.println("Hello Murica");
			break;
		default:
			System.out.println("IDK");
		}
		
	}
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is "+name+" and I am "+age+" years old");
	}
	void isSnowing(boolean isSnowing) {
		
		//boolean isSnowing = false;
		
		if(isSnowing) {
			System.out.println("Stay in");
		}else {
			System.out.println("Go out");
		}
	}
	public static void main(String[] args) {

		Hello hello = new Hello();
		hello.sayHello("Terri"); //terri --> argument, value that we pass when we call a method
		hello.sayHello("Sophy");
		hello.sayHelloDifferentLanguage("Cambodia");
		hello.sayHelloDifferentLanguage("Laos");
		hello.sayHelloDifferentLanguage("Vietnam");
		hello.sayNameAndAge("Terri", 34);
		hello.isSnowing(true);
		hello.sayHelloDifferentLanguage("England");
		hello.sayHelloDifferentLanguage("CambodiA");
		

	}

	/*
	 * create a method that will say hello in different language based on the will
	 * be passed when user calls a method
	 */

}
