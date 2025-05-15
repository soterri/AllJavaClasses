package ConstuctorClass;

public class ConstructorIntro {
	
	//to create a constructor
	
	public ConstructorIntro() {
		System.out.println("I am constructor!");	
	}
	
	public ConstructorIntro(String str){
		System.out.println("Constructor with 1 string");
	}
	public static void main(String[] args) {
		
		ConstructorIntro obj = new ConstructorIntro();
		ConstructorIntro obj1 = new ConstructorIntro("hello");
		
	}

}
