package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ClassTask {

	public static void main(String[] args) {

		/*
		 * Create a map from array of cities that will sort keys in abc order as a key -
		 * store the name of the city as a value - store the length of characters of the
		 * city ex: Phnom Penh=9 Vientiane=9 Saigon=6 Washington DC=13 if the city is
		 * more then 10 characters remove the city using iterator
		 */

		String[] city = { "Phnom Penh", "Vientiane", "Saigon", "Washington DC" };

		Map<String, Integer> cityMap = new TreeMap<>();

		for (String s : city) {
			cityMap.put(s, s.length());
		}
		System.out.println(cityMap);

		Set<Entry<String, Integer>> cities = cityMap.entrySet();

		Iterator<Entry<String, Integer>> cityIt = cities.iterator();

		while (cityIt.hasNext()) {

			Entry<String, Integer> e = cityIt.next();

			Integer length = e.getValue();
			String name = e.getKey();

			if (length < 10) {
				cityIt.remove();
			}
		}
		System.out.println(cities);
	}
}
