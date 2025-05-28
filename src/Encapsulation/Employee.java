package Encapsulation;

public class Employee {

	// define private variables
	private String name;
	private int age;
	private double salary;

	// define public methods to give access to private variables
	// getters - giving access to variables - read only
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	// setters
	public void setName(String name) {
		if (!name.isEmpty() && name.length()>3) {
			this.name = name;
		}
	}

	public void setAge(int age) {
		if(age>16) {
		this.age = age;
	}
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
