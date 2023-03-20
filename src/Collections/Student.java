package Collections;

public class Student {

	String name;
	int studentId;
	
	public Student(String name, int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	
	public void displayInfo() {
		System.out.println("My name is "+name+" and student ID is "+studentId);
	}
}

