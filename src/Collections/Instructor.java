package Collections;

public class Instructor {
	
	String name;
	String lastName;
	
	public Instructor(String name, String lastName) {
		this.name=name;
		this.lastName=lastName;
	}

	public void display() {
		System.out.println("Instructors full name is "+name+" "+lastName);
	}
}
