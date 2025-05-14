package Polymorphism;

public class Student {
	
	public static void main(String[] args) {
		
		Student stu1 = new Student();
		stu1.doHomework();
	}

	public void study() {
		System.out.println("terri needs to study like shit");
	}

	private void doHomework() {
		System.out.println("do homework");
	}

	public void research() {
		System.out.println("Do research");

	}

	protected void attendClasses() {
		System.out.println("Attend classes");
	}

}
class SyntaxStudent extends Student{
	@Override
	public void study() {
		System.out.println("syntax student studies");
	}
	@Override
	protected void attendClasses() {
		System.out.println("syntax student needs to attend classes");
	}
	//@Override private does not participate in inheritance, only visible to the class 
	//where its declared. two separate methods from class student and SyntaxStudent
	private void doHomework() {
		System.out.println("Student needs to do homework");
	}
	
}