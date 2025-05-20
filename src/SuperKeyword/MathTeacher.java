package SuperKeyword;

public class MathTeacher extends Teacher {


	MathTeacher(String name, String lastName) {
		// super(); compiler will make a call implicitly if you do not
		super(name, lastName);//making a call to immediate parent class constructor
		//System.out.println("Child class constructor");
	}
}
