package Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CarTest {

	public static void main(String[] args) {

		// creating an obj of the class and assigning it to the variable
		// and variable is type of collection - map
		// storing k+v pair
		Map<Integer, Car> mapCar = new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW", "X5"));
		mapCar.put(2, new Car("Tesla", "S"));
		mapCar.put(3, new Car("Mercedes", "S5"));
		mapCar.put(4, new Car("Honda", "Civic"));
		mapCar.put(5, new Car("Cadillac", "Escalade"));

		// display only VALUE objects - use values();
		Collection<Car> coll = mapCar.values();

		for (Car c : coll) {
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

		Set<Entry<Integer, Car>> set = mapCar.entrySet();

		for (Entry<Integer, Car> ent : set) {

			Integer itKey = ent.getKey();
			Car itValue = mapCar.get(itKey);

			System.out.println(itKey + " " + itValue.make + " " + itValue.model);

		}

		// using KEYSET to map keys to values
		System.out.println("Using keyset");

		Set<Integer> keySet = mapCar.keySet();

		for (int key : keySet) {

			System.out.println(key + " -- " + mapCar.get(key).make + "--" + mapCar.get(key).model);

		}
	}
}