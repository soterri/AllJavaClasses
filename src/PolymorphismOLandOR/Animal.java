package PolymorphismOLandOR;

public class Animal {

	public void sleep() { //as a parent class, have common behaviors for sub classes
		System.out.println("Animal can sleep");
	}

	public void eat() {
		System.out.println("Animal can eat");
	}

}

class Cat extends Animal { //cat class is a child class of animal
		
	@Override
	public void sleep() {
		System.out.println("Cat can sleep");
	}
	//implementing own behavior in class
	public void meow() {
		System.out.println("Cat can meow");
	}
	
}

