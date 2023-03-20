package Polymorphism;

public class Animal {

	public void sleep() {
		System.out.println("Animal can sleep");
	}

	public void eat() {
		System.out.println("Animal can eat");
	}

}

class Cat extends Animal {
		
	@Override
	public void sleep() {
		System.out.println("Cat can sleep");
	}
	//implementing own behavior in class
	public void meow() {
		System.out.println("Cat can meow");
	}
	
}
