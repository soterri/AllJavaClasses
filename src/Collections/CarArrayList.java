package Collections;

import java.util.ArrayList;

public class CarArrayList {
	public static void main(String[] args) {
		
		/*Create an arraylist of cars and retrieve all the values using 3 different ways
		 */
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Acura");
		cars.add("Tahoe");
		
		System.out.println("Enhanced loop");
		for(String listOfCars:cars) {
			System.out.println(listOfCars);
		}
		System.out.println("for loop");
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		System.out.println("---backwards---");
		for(int j=cars.size()-1; j>0; j--) {
			System.out.println(cars.get(j));
		}
		
		System.out.println("Iterator");
		java.util.Iterator<String> iterator = cars.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
