package VariablesAndAccessModifiers;

public class Doggy {

	//static variables - declared inside the class but OUTSiDE of any method, constructor, block
	static String breed = "Pitbull";
	static int paws =4;
	static int tale = 1;
	
	//instance variables - declared inside a class but OUTSIDE of any method
	String name;
	String color;
	
	//create a method
	void display() {
		System.out.println("Puppy name is "+name+" and breed is "+breed+" and has "+paws+" paws");
		
	}
	
	public static void main(String[] args) {
		
		//creating instances of class
		Doggy pup1 = new Doggy();
		pup1.name="Koda";
		pup1.color="gray";
		pup1.display();
		
		
		Doggy pup2 = new Doggy();
		pup2.name="John";
		pup2.color="yellow";
		pup2.display();
		
		Doggy pup3 = new Doggy();
		pup3.name = "Chanthavong";
		pup3.color="yello";
		pup3.breed="Doberman";
		pup3.display();
		pup2.display(); //changes the breed to doberman bc line 37
		
		
		
	}
}
