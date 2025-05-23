package PolymorphismOLandOR;

public class Animal1 {

	Animal1(){
		System.out.println("Animal constructor");
	}
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}

class Monkey extends Animal1 {

	// cannot override static methods with instance methods
	// public void whoAmI(){

	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}

// how can you check if youre overriding without the annotation?
// by writing code to achieve runtime polymorphism - create an obj of child
// class and give reference to parent class

//cannot override static method
//when both methods are static within sub and super class - it is method hiding.

