package SuperKeyword;


public class TeachTestClass {
	public static void main(String[] args) {

		MathTeacher mt = new MathTeacher("Max", "Thach");
		System.out.println(mt.name);
		mt.display();
	}
}

/*super can be used with variables, methods, and constructors
 * WHY & HOW?
 * inside child class constructor we need to make a call to parent class
 * constructor, we need to initialize parent class variables
 * and if inside parent class we have only parameterized constructor
 * child class is enforced to make call to invoke parent class constructor
 * using super();
 * 
 */
