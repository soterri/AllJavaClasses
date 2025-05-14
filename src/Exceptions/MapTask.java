package Exceptions;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTask {

	public static void main(String[] args) {

		/*
		 * create a map from array of cities that will sort keys in abc order as key
		 * store name of city as value store length of the city if any city name is more
		 * than 7 characters remove city using iterator
		 */

		String[] city = { "Washington DC", "Phnom Penh", "Los Angeles", "Vientiane", "Saigon City", "DC" };

		Map<String, Integer> cityMap = new TreeMap<>();

		for (String c : city) {
			cityMap.put(c, c.length());
		}
		System.out.println(cityMap);

		Set<Entry<String, Integer>> cities = cityMap.entrySet();

		Iterator<Entry<String, Integer>> itr = cities.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> e = itr.next();
			Integer length = e.getValue();

			if (length <10 ) {
				itr.remove();
			}
		}
		System.out.println(cityMap);

//		String[] city = {"Washington DC", "Phnom Penh", "Los Angeles", "Vientiane", "Saigon City", "DC"};
//		
//		Map<String, Integer> cityMap = new TreeMap<>();
//		
//		for(String s:city) {
//			cityMap.put(s, s.length());
//		}
//		System.out.println(cityMap);
//		
//		Set<Entry<String, Integer>> cities = cityMap.entrySet();
//		//System.out.println(cities);
//		
//		Iterator<Entry<String, Integer>> itr = cities.iterator();
//		while(itr.hasNext()) {
//			Entry<String, Integer> e =itr.next();
//			Integer length = e.getValue();
//			
//			
//			if(length>7) {
//				itr.remove();
//			}
//		}
//		System.out.println(cityMap);

	}
}
