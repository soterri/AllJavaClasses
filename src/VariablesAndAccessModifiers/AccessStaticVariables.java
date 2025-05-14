package VariablesAndAccessModifiers;

public class AccessStaticVariables {
	
	public static void main(String[] args) {
		
		Doggy dog = new Doggy();
		dog.name="Koda";
		System.out.println(dog.name);
		
		System.out.println(Doggy.breed);
		Doggy.breed="Rotwieler";
		System.out.println(dog.breed);//possible but not preferable 
		
		
	}

}
