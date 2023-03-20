package InheritanceAndThisKW;

public class Constructor {

	void Constructor(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		obj.Constructor();
	}
	Constructor(){
		System.out.println("Constructor");
	}
}
