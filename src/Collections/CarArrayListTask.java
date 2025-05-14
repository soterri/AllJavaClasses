package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CarArrayListTask {
	public static void main(String[] args) {
		
		/*Create an arrayList of cars and retrieve all 
		 * values using 3 different ways
		 */
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Acura");
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Lexus");
		
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("***advanced for loop****");
		for(String car:cars) {
			System.out.println(car);
		}
		System.out.println("-----Iterator----------");
		Iterator<String> it = cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}
}
