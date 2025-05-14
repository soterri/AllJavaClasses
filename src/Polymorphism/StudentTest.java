package Polymorphism;

public class StudentTest {
	public static void main(String[] args) {
		
		SyntaxStudent ss = new SyntaxStudent();
		ss.study();
		ss.attendClasses();
		ss.research();
		
		System.out.println("******************");
		Student stu = new Student();
		stu.study();
		stu.research();
		stu.attendClasses();
		
		System.out.println("----Giving reference to parent class-----------");
		Student ss1 = new SyntaxStudent();
		ss1.study();
		ss1.attendClasses();
		ss1.research();
		

	}
}
