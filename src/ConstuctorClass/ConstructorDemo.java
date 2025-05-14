package ConstuctorClass;

public class ConstructorDemo {
	
	ConstructorDemo() {
		System.out.println("I'm a constructor");
	}

	ConstructorDemo(String str) {
		System.out.println("I am a constructor with one parameter " + str);

	}
	ConstructorDemo(String str1, int num){
		System.out.println("I am a constructor with 2 parameters "+str1+" & "+num);
	}
	ConstructorDemo(int num1, int num2){
		System.out.println("The sum of these 2 numbers is "+(num1+num2));
	}

	public static void main(String[] args) {

		ConstructorDemo obj = new ConstructorDemo();
		System.out.println("Code after creating an object");
		obj.hello();
		obj.hello1();
		
		ConstructorDemo obj2 = new ConstructorDemo("Parametized Constructor");
		
		ConstructorDemo obj3 = new ConstructorDemo("Savannah", 1);
		
		ConstructorDemo obj4 = new ConstructorDemo(20, 30);

	}

	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
	}
	void hello1() {
		System.out.println("Hello Savannah! <3");
	}
}