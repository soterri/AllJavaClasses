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

/*
 * DIFFERENCE B/W CONSTRUCTOR & METHOD
 *1. Constructor MUST NOT have a return type while METHOD MUST HAVE return type
 *2. Constructor must have same name as class name, while method can have any given name
 *3. Constructors CAN NOT use any NON access modifiers while method can
 *4. Constructors call happens automatically when instance being created while method we must call a method
 * 5. Constructor initializes the object while method perform some specific functionalities, 
 * by using method we describe behavior of the object.
 * 
 * SIMILARITIES
 * 1. both can have or not have parameters
 * 2. both can use access modifiers
 */
