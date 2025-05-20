package SuperKeyword;

public class Teacher {

	String name, lastName;

	public Teacher() {
		System.out.println("Parent class constructor");
	}

	public Teacher(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	public void display() {
		System.out.println("name: "+name+" and last name "+lastName);
	}

}
