package StaticKeywordAndAccessModifiers;

public class Husky {

	static String breed="Pitbull";
	static int paws = 4;
	static int tale=1;
	
	String name;
	String color;
	
	void display() {
		System.out.println("Puppy name is "+name+" and it's breed is "+breed);
	}
	
	public static void main(String[] args) {
		
		Husky puppy = new Husky();
		
		Husky puppy1 = new Husky();
		
		
		puppy.name="Koda";
		puppy.color="Gray";
		puppy.display();
		
		puppy1.name="Willow";
		puppy1.color="White";
		puppy1.breed="Husky";
		puppy1.display();
		
		breed="Husky";
		puppy.display();
		
	}
}
