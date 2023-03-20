package Polymorphism;

public class StudentTest {
	public static void main(String[] args) {
		
		SyntaxStudent ss = new SyntaxStudent();
		ss.study();
		ss.attendClasses();
		ss.research();
		
		Student stu = new Student();
		stu.study();
		stu.research();
		stu.attendClasses();
		

	}
}
