package StaticKeywordAndAccessModifiers;

public class Human {
	
	String name;
	String lastName;
	
	static int eyes=2;
	static int nose=1;
	static boolean brain=true;
	
	public static void main(String[] args) {
		
		Human h1 = new Human();
		h1.name="Terri";
		h1.lastName="Thach";
		
		Human h2 = new Human();
		h2.name="Savannah";
		h2.lastName="Meuandane";
		h2.lastName="Thach";
		System.out.println(h2.name);
		System.out.println(Human.eyes);
		System.out.println(Human.nose);
		System.out.println(Human.brain);
		//System.out.println(h2.eyes); not preferable way - will get a warning that since eyes is static its belongs to the class - access it that way
		
	}

}
