package InheritanceAndThisKW;

public class Child2 extends Parent{
	
	
	public static void main(String[] args) {
		
		
		Child1 childd = new Child1();
		System.out.println(childd.eyeColor);
		childd.hairColor="black";
		childd.canCook();
		System.out.println(childd.race);
		
	}

}
