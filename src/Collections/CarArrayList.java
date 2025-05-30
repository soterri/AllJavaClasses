package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CarArrayList {
	public static void main(String[] args) {

		/*
		 * Create an arraylist of cars and retrieve all the values using 3 different
		 * ways
		 */
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Honda");
		cars.add("Tahoe");
		cars.add("Benzy");
		cars.add("Range Rover");
		
		int lan=cars.size();
		System.out.println(lan);
		
		System.out.println(cars.get(2));
		
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("backwards");
		for(int j=cars.size()-1; j>=0; j--) {
			System.out.println(cars.get(j));
		}
		System.out.println("Iterator");
		Iterator<String> iterator = cars.iterator();

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("enhanced loop");
		for(String caros:cars) {
			System.out.println(caros);
		}
		
	}
}
