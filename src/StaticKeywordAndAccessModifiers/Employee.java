package StaticKeywordAndAccessModifiers;

public class Employee {

	// create variables to hold: name, last name, title, ssn

	public static String title; 
	public String name; //accessible everywhere
	protected String lastName;//accessible within same package
	double salary; //accessible within same package
	private long ssn; //accessible only within the same class private delclared

	public static void method1() {
		System.out.println("PUBLIC method");

	}

	protected void method2() {
		System.out.println("PROTECTED method");
	}

	void method3() {
		System.out.println("DEFAULT method");
	}

	private void method4() {
		System.out.println("PRIVATE method");
	}
	public void displayInfo() {
		System.out.println("My name is "+name+ " "+lastName+ " and my salary is "+salary);
}
	
	public static void main(String[] args) {
	Employee emp = new Employee();
	emp.name="terri";
	emp.lastName="thach";
	emp.salary=54542151;
	emp.ssn=1234565;
	method1();
	emp.method2();
	emp.method3();
		
	}
}
