package Oops;

public class Google {
	
	//define features with emp id, name, last name, salary, title
	//define behaviors working, getting paid, attending meetings
	
	int empId;
	double salary;
	String name, lastName, title;
	
	void work() {
		System.out.println(title+ " is working");
	}
	
	void getPaid() {
		System.out.println(name+ " is getting paid "+salary);
	}
	void attendMeetings() {
		System.out.println(name+" is attending meetings");
	}
	
	public static void main(String[] args) {
		
		Google emp = new Google();
		emp.empId=123;
		emp.name="Terri";
		emp.lastName="Thach";
		emp.salary=2000000;
		emp.title="Test Lead";
		emp.work();
		emp.getPaid();
		emp.attendMeetings();
		
		//creating second obj
		Google emp2 = new Google();
		emp2.name="Sotheary";
		emp2.lastName="Thach";
		emp2.salary=500000;
		emp2.title="Project manager";
		emp2.getPaid();
		emp2.attendMeetings();
		
	}

}
