package PolymorphismOLandOR;

public class Employee {
//defining common features that can be applicable for all child classes
	public double salary;
	String work ;

	public void getPaid() {
		System.out.println("employee gets paid " + salary);

	}

	public void work(String work) {
		System.out.println("Employee work position is " + work);
	}
}

class FullTimeEmployee extends Employee {
	
	String works;
	int paid;
	
	public void work(String work) {
		System.out.println("FT employee works as "+work+" and gets "+paid);
	}
	
	

}
