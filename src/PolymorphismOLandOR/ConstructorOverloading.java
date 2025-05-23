package PolymorphismOLandOR;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("No argument");
	}
	ConstructorOverloading(String str){
		System.out.println("Overloading with 1 string param");
	}
	ConstructorOverloading(int num){
		System.out.println("Constructor with 1 int parameter");
	}
	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading("Hello");
		ConstructorOverloading obj1 = new ConstructorOverloading(1);
		
	}
}
