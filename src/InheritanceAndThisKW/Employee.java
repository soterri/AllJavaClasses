package InheritanceAndThisKW;

public class Employee {

	int salary;//accesible within same pkg
	static String companyName; //acessible throughout the project
	protected int employeeId;
	private String employeeSsn; //acessible within same class
	
	void work() {
		System.out.println("I work at "+companyName+" company");
		
	}
	void getPaid() {
		System.out.println("I get paid "+salary);
	}
	
}
