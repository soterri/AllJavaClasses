package Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;

public class CarTest {

	public static void main(String[] args) {

		// creating an obj of the class and assigning it to the variable
		// and variable is type of collection - map
		// storing k+v pair
		Map<Integer, Car> mapCar = new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW", "X5")); // storing objects of the Car type
		mapCar.put(2, new Car("Tesla", "S"));
		mapCar.put(3, new Car("Mercedes", "S5"));
		mapCar.put(4, new Car("Honda", "Civic"));
		mapCar.put(5, new Car("Caddy", "Escalade"));
		mapCar.put(5, new Car("Cadillac", "Escalade"));// overrides line 21

		System.out.println(mapCar.size());

		// display only VALUE objects - use values();
		Collection<Car> coll = mapCar.values();
		
		for(Car c:coll) {
			c.display();
			
			
			
			
		}
		System.out.println(mapCar.size());

		// map key to its corresponding values - can use entryset or keyset
//		Set<Entry<Integer,Car>> set = mapCar.entrySet();
//		
//		for(Entry<Integer, Car> ent: set) {
//			
//			Integer itKey = ent.getKey();
//			Car itVal = mapCar.get(itKey);
//			System.out.println(itKey+" -- "+itVal.make+" "+itVal.model);

		System.out.println("Using ENTRYSET");
		Set<Entry<Integer, Car>> set = mapCar.entrySet();

		for (Entry<Integer, Car> ent : set) {

			Integer itKey = ent.getKey();
			Car itCar = mapCar.get(itKey);
			System.out.println(itKey + " -- " + itCar.make + " " + itCar.model);
			// itCar is the variable that refers to the object Car type

		}


		// using KEYSET to map keys to values
		System.out.println("Using keyset");

		Set<Integer> keySet = mapCar.keySet();// why integer? bc we getting collection of keys that is only of integer
												// objects

		for (int key : keySet) {
			// Integer+map Object -> value object(Car type)
			System.out.println(key + " -- " + mapCar.get(key).make + "--" + mapCar.get(key).model);

		}
		System.out.println("---iterator---");

		Iterator<Entry<Integer, Car>> carIterator = mapCar.entrySet().iterator();
		while (carIterator.hasNext()) {
			Entry<Integer, Car> singleEntry = carIterator.next();
			System.out.println(singleEntry.getKey());
		}
	}
}