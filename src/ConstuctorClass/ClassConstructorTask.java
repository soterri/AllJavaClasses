package ConstuctorClass;

public class ClassConstructorTask {
	
	String name;
	int age;
	
	ClassConstructorTask(String myName, int myAge) {
		name=myName;
		age=myAge;
		
	}
	ClassConstructorTask() {
		System.out.println("My constructor with no parameters");
	}
	
	public static void main(String[] args) {
		
		ClassConstructorTask obj = new ClassConstructorTask();
		obj.age=34;
		obj.name="Terri";
		obj.getDetails();
		
		ClassConstructorTask obj1 = new ClassConstructorTask("John", 39);
		obj1.getDetails();
	}
	
	void getDetails() {
		System.out.println("My name is "+name+" and age is "+age);
	}

}
