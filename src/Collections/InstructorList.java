package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class InstructorList {
	/*
	 * create a list that will hold 5 instructors
	 */
	public static void main(String[] args) {
		//iList - we are storing our collections in that variable
		List<Instructor> iList = new ArrayList<>();
				//creating an object of Instructor class, the Instructor part is calling a constructor to pass the arguments of that constructor/initialized variables
		iList.add(new Instructor("Asel", "Umur"));
		iList.add(new Instructor("Diego", "Juarez"));
		iList.add(new Instructor("Weqas", "Hass"));
		
		for(Instructor i:iList) {
			i.display();
			
		}
		System.out.println("-----------------");
		Iterator<Instructor> it = iList.iterator();
		while(it.hasNext()) {
			
			it.next().display();
		}

	}
}
