package Encapsulation;

public class EmpTest {
	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("Terri");
		emp.setAge(20);
		emp.setSalary(220.000);
		System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getSalary());
		
	}

}
