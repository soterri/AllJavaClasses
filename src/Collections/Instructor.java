package Collections;

public class Instructor {

	String name;
	String lastName;

	Instructor(String name, String lastName) {
		this.name = name;//initializing instance variables
		this.lastName = lastName;
	}

	public void display() {
		System.out.println("Instructors full name is " + name + " " + lastName);
	}
}
