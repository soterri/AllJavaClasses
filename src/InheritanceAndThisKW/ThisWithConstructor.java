package InheritanceAndThisKW;

public class ThisWithConstructor {

	public ThisWithConstructor() {
		System.out.println("I am a non argument constructor");
	}

	ThisWithConstructor(String str) {
		this();//used to call current class constructor with no argument
		System.out.println("I am a constructor with 1 String argument");
	}
	ThisWithConstructor(String str1, String str2){
		this(str1);
		System.out.println("Constructor with 2 string parameters");
		
	}
	public static void main(String[] args) {
		
		//1. first obj is created with use of kw new 2. calling constructor 3. than finds the constructor with a parameter and goes inside body
		// calling constructor with this() - looking for non argument constructor (line5) 
		ThisWithConstructor obj = new ThisWithConstructor("Hello");
		
		//can we execute 2 constructors at the same time?
		//yes - it can be achieved using THIS KW this();
		//known as CONSTRUCTOR CHAINING
		System.out.println("---------------");
		ThisWithConstructor obj1 = new ThisWithConstructor("Hello", "Bye");
		
		
	}

}
