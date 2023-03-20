package StaticKeywordAndAccessModifiers;

public class InstanceVariables {

	String name = "Terri"; // instance variable

	public static void main(String[] args) {

		String name = "John"; // local variable that is only visible to the main method
		System.out.println(name);

		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name);
		// changing value of the instance variable
		obj.name = "Sophy";
		System.out.println(obj.name);

		// creating a new instance of Class InstanceVariables();
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);

	}

}