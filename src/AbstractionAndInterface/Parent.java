package AbstractionAndInterface;

public class Parent {

	static void hello() {
		System.out.println("Hello super class");
	}

}

class Child extends Parent {
	static void hello() {
		System.out.println("Hello sub class"); //this method will be hidden bc parent method is static?
	}//achieving method hiding

}