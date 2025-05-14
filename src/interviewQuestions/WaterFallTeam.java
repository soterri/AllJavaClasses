package interviewQuestions;

import InheritanceAndThisKW.Employee;

public class WaterFallTeam extends Employee{

	public static void main(String[] args) {
		
		WaterFallTeam team = new WaterFallTeam();
		team.companyName="Accenture";
		//team.salary=10000000;
		//accessing protected variable in a different pkg through inheritance
		team.employeeId=103;
		team.getPaid();
		
				
		
	}
}
