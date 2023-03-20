package Polymorphism;

public class RunTimePolymorphism {
	
	public static void main(String[] args) {
		
		//widening
		double d = 90;
		
		//narrowing
		int i=(int)1.99;
		
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.meow();
		//non primitive typecasting
		//widening - creating an o
		//object of the class and giving reference to the parent class
		Animal obj = new Cat();
		obj.eat();
		obj.sleep();
		
		
		
		//narrowing
		//Cat obj1 = new Animal(); cant convert from animal to cat
		
	}

}
