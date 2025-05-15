package StaticKeywordAndAccessModifiers;

public class AccessingMembersOfEmployee {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Employee.title="QA";
		emp.name="Terri";
		emp.lastName="Thach";
		emp.salary=5455454;
		//emp.ssn - private not accessible
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.method4();not visible bc private, not accessible
		emp.displayInfo();
	}

}
