package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class StudentTest {

	public static void main(String[] args) {
		
		/*create an arrayList that will store student type of objects
		 */
		
		//created our own class - students
		//inside the students class we created our own instance variables, methods, constructors
		List<Student> students = new ArrayList<>();
		
		//Creating student objects and storing it inside stu variable
		Student stu = new Student("Terri", 101);
		Student stu1 = new Student("John",102);
		Student stu2 = new Student("Savannah", 103);
		
		//display info of each student
		students.add(stu);
		students.add(stu1);
		students.add(stu2);
		
		//stu1.displayInfo();
		//stu2.displayInfo();
		
		//to reduce redundancy use for loop
		for(Student stus:students) {
			stus.displayInfo();
		}
		//adding more objects of a student type
		students.add(new Student("Sophy", 104));
		students.add(new Student("Max", 105));
		students.add(new Student("Ange",106));
		
		System.out.println("------------------");
		//display info of each student
		Iterator<Student> it=students.iterator();
		
		while(it.hasNext()) {
			
			it.next().displayInfo();
		}
	}
}
