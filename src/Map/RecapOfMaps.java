package Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RecapOfMaps {

	public static void main(String[] args) {
		Map<String, Integer> groceryMap = new LinkedHashMap<>();
		groceryMap.put("Apple", 2);
		groceryMap.put("Bread", 5);
		groceryMap.put("Milk", 10);
		groceryMap.put("Ice cream", 1);

		// retrieving value
		groceryMap.get("Apple");

		// verify if specific key or value is in the map
		boolean returnKey = groceryMap.containsKey("Milk");
		groceryMap.containsValue(2);

		System.out.println(returnKey);

		// retrieve all values?
		Collection<Integer> values = groceryMap.values();
		for (Integer val : values) {
			System.out.println(val);
		}
		System.out.println("Iterator");
		Iterator<Integer> valIt = values.iterator();

		while (valIt.hasNext()) {

			System.out.println(valIt.next());
		}
		// get all keys and map them to values
		// Set<Entry<String, Integer>> allValues =

		// Set<String> keys=groceryMap.keySet();

		for (String k : groceryMap.keySet()) {

			System.out.println(k.toUpperCase() + " -> " + groceryMap.get(k)); // get is retrieving all values (k+v)
		}
		System.out.println("------------");
		
		Iterator<String> keyGroceryMap = groceryMap.keySet().iterator();

		while (keyGroceryMap.hasNext()) {
			
			String itKey = keyGroceryMap.next();
			Integer val = groceryMap.get(itKey);

			System.out.println(itKey.toLowerCase()+" ---- "+val);
		}
		System.out.println("ENTRYSET");
		//get allkeys and map them to values using ENTRY SET
		
		Set<Entry<String, Integer>> entryIt = groceryMap.entrySet();
		
		for(Entry<String, Integer> entry: entryIt) {
			System.out.println(entry);
		}
	}

}
