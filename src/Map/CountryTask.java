package Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountryTask {

	public static void main(String[] args) {

		//store country and capital - print using for loop and iterator print both key and value
		Map<String, String> countries = new TreeMap<>();

		countries.put("Cambodia", "Phnom Penh");
		countries.put("Laos", "Vientiane");
		countries.put("Vietnam", "Saigon City");
		countries.put("USA", "Washington DC");
		countries.put("Thailand", "Bangkok");

		Set<String> keys = countries.keySet();

		for (String key : keys) {
			System.out.println(key);
		}
		System.out.println("ITERATOR");
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Collection<String> values = countries.values();

		for (String val : values) {
			System.out.println(val);
		}
		System.out.println("************************");
//		Iterator<String> keysIterator = keys.iterator();
//		while (keysIterator.hasNext()) {
//
//			String mapKey = keysIterator.next();
//			String mapValue = countries.get(mapKey);
//
//			System.out.println(mapKey + "---" + mapValue);
		Iterator<String> keysIterator = keys.iterator();
		while(keysIterator.hasNext()) {
			
			String mapKey = keysIterator.next();
			String mapValue = countries.get(mapKey);

			System.out.println(mapKey + "---" + mapValue);
			
		}

	}
}
