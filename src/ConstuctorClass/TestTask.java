package ConstuctorClass;

public class TestTask {
	
	public static void main(String[] args) {
		Task obj = new Task();
		Task obj1 = new Task("Terri");
		Task obj2 = new Task(1);
		//Task obj3 = new Task(10, 15); can't access bc private constructor
	}

}
