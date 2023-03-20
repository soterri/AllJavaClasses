package StaticKeywordAndAccessModifiers;

public class StaticVsNonStatic {

	//template for a student(school, name, and grade)
	
	static String school="Syntax"; //static variable
	String name; //instance variable
	char grade;
	
	//instance method
	void getInfo() {
		System.out.println("Student: "+name+ " is attending "+school+" and has the grade "+grade);
	}
	//static method
	static void getInfo1() {
		System.out.println("I am attending "+school);
		
	}
	public static void main(String[] args) {
		
		/*accessing static members within same class
		 *just use name for a variable
		 *or call method by its name only 
		 */
		
		System.out.println(school);
		getInfo1();
		
	}
}
