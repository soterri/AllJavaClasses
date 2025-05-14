package ConstuctorClass;

public class Task {

	public Task() {
		System.out.println("Public constructor");
	}

	Task(String str) {
		System.out.println("Default with 1 paramter");
	}

	protected Task(int num) {
		System.out.println("Protected with 1 parameter");
	}

	private Task(int num, int num2) {
		System.out.println("Private Constructor");
	}

	public static void main(String[] args) {
		Task obj = new Task();
		Task obj1 = new Task("Terri");
		Task obj2 = new Task(1);
		Task obj3 = new Task(10, 15);

	}

}
