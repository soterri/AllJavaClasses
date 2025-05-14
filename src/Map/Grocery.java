package Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Grocery {

	public static void main(String[] args) {

		Map<String, Integer> grocery = new LinkedHashMap<>();
		grocery.put("milk", 5);
		grocery.put("apples", 10);
		grocery.put("bread", 1);

		// to retrieve a single value
		System.out.println(grocery.get("milk"));

		// verify specific key or value is in map - use CONTAINS
		boolean contains = grocery.containsKey("apples");
		boolean contains1 = grocery.containsValue(10);
		System.out.println(contains);
		System.out.println(contains1);

		// how to retrieve all values from map?!

		Collection<Integer> values = grocery.values();

		for (Integer val : values) {
			System.out.println(val);
		}

		System.out.println("-------------------");

		Iterator<Integer> valIt = values.iterator();

		while (valIt.hasNext()) {

			System.out.println(valIt.next());
		}

		// how to retrieve all keys and map them to values

		Set<String> keys = grocery.keySet();

		// for(String k: grocery.keySet()) -- another way

		for (String k : keys) {
			System.out.println(k + "--->" + grocery.get(k));
		}
		System.out.println("ITERATOR");

		Iterator<String> keyIt = grocery.keySet().iterator();
		while (keyIt.hasNext()) {

			String keyz = keyIt.next();
			Integer valz = grocery.get(keyz);
			System.out.println(keyz + "--" + valz);

		}
		// get all keys and map them to values using ENTRY SET - a set of entry objects
		// - entry will have getKey and getValue methods
		System.out.println("USING ENTRY SET!");

		Set<Entry<String, Integer>> entry = grocery.entrySet();
		for (Entry<String, Integer> e : entry) {
			System.out.println(e.getKey() + "-**-***-" + e.getValue());
		}

	}
}
//Iterator<String> keyIt = grocery.keySet().iterator();
//while(keyIt.hasNext()) {
//	
//	String keyz = keyIt.next();
//	Integer valz = grocery.get(keyz);
//	System.out.println(keyz+"--"+valz);