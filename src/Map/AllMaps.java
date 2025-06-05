package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {

		// create a grocery map (item, quantity) where we do not care about insertion
		// order
		Map<String, Integer> grocery = new HashMap<>();
		grocery.put("milk", 1);
		grocery.put("cookies", 2);
		grocery.put("bananas", 3);
		grocery.put("dumplings", 4);

		Map<String, Integer> cleaners = new LinkedHashMap<>();
		cleaners.put("Hand sanitizer", 2);
		cleaners.put("Lysol", 5);
		cleaners.put("toilet paper", 10);
		cleaners.put("paper towels", 15);

		// create a map that stores all grocery and cleaners into one map
		Map<String, Integer> shopping = new TreeMap<>();
		shopping.putAll(grocery);
		shopping.putAll(cleaners);
		System.out.println(shopping);

		// get all keys
		Set<String> setOfKeys = shopping.keySet();

		for (String k : setOfKeys) {
			System.out.println(k);

			// for(String k:shopping.keySet()) {
			// System.out.println("another way "+ k);
			
			System.out.println("-----method chaining----------");
			Iterator<String> listy = shopping.keySet().iterator();
			while(listy.hasNext()) {
				System.out.println(listy.next());
			}
			
		}
		//get all keys using iterator
		
		Iterator<String> it = setOfKeys.iterator();
		while(it.hasNext()) {
			String list=it.next();
			System.out.println(list);
		}
		//get all values
		//using collections!
		Collection<Integer> coll = shopping.values();
		for(Integer val:coll) {
			System.out.println(val);
		}
		System.out.println("---method chaining---");
		for(Integer v:shopping.values()) {
			System.out.println(v);
		}
		System.out.println("GETTING VALUES USING ITERATOR");
		Iterator<Integer> valIt=shopping.values().iterator();
		while(valIt.hasNext()) {
			System.out.println(valIt.next());
			
		}
	
	}

}
