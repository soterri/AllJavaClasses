package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class InstructorList {
	/*
	 * create a list that will hold 5 instructors
	 */
	public static void main(String[] args) {

		List<Instructor> iList = new ArrayList<>();
		iList.add(new Instructor("Asel", "Umur"));
		iList.add(new Instructor("Diego", "Juarez"));
		iList.add(new Instructor("Weqas", "Hass"));
		
		for(Instructor i:iList) {
			i.display();
			
		}

	}
}
