package Polymorphism;

public class RunTimePolymorphism {
	
	public static void main(String[] args) {
		
		//widening
		double d = 90;
		
		//narrowing
		int i=(int)1.99; //convert it to int type and storing inside i variable
		
		//creating an obj of parent class
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		
		
		System.out.println("******************");
		//creating an obj of child class
		Cat cat = new Cat();
		cat.eat();//from parent
		cat.sleep();//from child
		cat.meow();//from child
		
		
		//non primitive typecasting
		//widening/upcasting 
		//creating an object of the child class and giving reference to the parent class
		System.out.println("-------------------");
		Animal obj = new Cat();
		obj.eat();//from animal class
		obj.sleep();//method will come from child class -> achieving runtime polymorphism
		/*runtime polymorphism, when creating an object of child class and giving 
		reference to parent class and then accessing the method
		//during compilation, COMPILER looks at parent/reference type class and checks 
		if method is available in parent in class and during runtime jvm will check, jvm executes the code
		during the runtime, jvm will go to child class first and then sees that method available
		creating an obj of child and check if method is available within child class, thats what it will execute.
		*/
		
		
		//narrowing
		//Cat obj1 = new Animal(); cant convert from sub to super class
		
	}

}

//4000222960252817
