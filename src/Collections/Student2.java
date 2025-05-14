package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Student2 {
	
	public static void main(String[] args) {
		
		int a; //creating a variable
		a=10; //assigning it
		
		int b = 10; //creating a variable assigning it
		
		//how can I have access to Student objects? bc 
		//the default access modifier and its accessible within the same package
		Student s1 = new Student("Cameron", 100);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(new Student("Cam", 101));
		list.add(new Student("Max", 102));
		list.add(new Student("Savannah", 1211));
		list.add(new Student("Sophy", 145401));
		
		Iterator<Student>it = list.iterator();
		while(it.hasNext()) {
			//Student st = it.next();
			//System.out.println(st.name);
			it.next().displayInfo();
		}
	}

}
