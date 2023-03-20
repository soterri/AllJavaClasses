package InheritanceAndThisKW;

public class Test {

	public static void main(String[] args) {
		
		Child1 child = new Child1();
		child.code();
		System.out.println(child.hairColor);
		child.sing();
		System.out.println(child.race);
		System.out.println(child.eyeColor);
		
		System.out.println("------------------------7");
		Parent parent = new Parent();
		parent.sing();
		System.out.println(parent.eyeColor);
		System.out.println(parent.hairColor);
		System.out.println(parent.race);
	}

}
