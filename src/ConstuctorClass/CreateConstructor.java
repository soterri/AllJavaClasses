package ConstuctorClass;

public class CreateConstructor {

	
	/*write a program that will have a constructor
	 * one with parameters and seconds without any parameters
	 *create a separate test class where you will execute both 
	 *of the constructors  
	 */
	String name;
	int num;
	
	public CreateConstructor(String myName, int myNum) {
		name=myName;
		num=myNum;
		//System.out.println("Hello "+name+" I'm "+num+" years old");
	}
	public CreateConstructor() {
		System.out.println("No parameter constructor");
	}
	void getDetails() {
		System.out.println("My name is "+name+ " and I'm "+num+" years old");
	}
	public static void main(String[] args) {
		
		CreateConstructor obj = new CreateConstructor();
		CreateConstructor obj1 = new CreateConstructor("Terri", 34);
		obj1.getDetails();
	}
}
