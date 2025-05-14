package InheritanceAndThisKW;

public class TestScrum {

	public static void main(String[] args) {
		
		System.out.println("Create an object of a Employee");
		Employee emp = new Employee();
		Employee.companyName="Freddie Mac";
		emp.salary=1000000;
		emp.work();
		emp.getPaid();
		
		
		//as a parent class you can not access child class features
		
		System.out.println("Creating an obj of Scrum Team");
		ScrumTeam st = new ScrumTeam();
		st.salary=100000;
		st.work();
		st.getPaid();
		st.artifacts="Product Backlog, Spring Backlog, Burndown chart";
		st.ceremonies="Sprint Demo, Planning, Retro, Daily Standup";
		st.attendScrumMeetings();
		
		System.out.println("---Developer---");
		Developer dev = new Developer();
		dev.salary=1300000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.develop();
		dev.artifacts="Spring backlog";
		dev.ceremonies="Sprint demo, planning, retro, daily standup";
		dev.employeeId=101;
		//dev.employeeSsn -> not accessible bc it's private
		
	}
}
