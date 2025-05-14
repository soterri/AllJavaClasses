package Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Country {

	/*create a map of countries with its capital that will store
	 * countries in abc order
	 * print all keys and values using for each loop and iterator
	 */
	public static void main(String[] args) {
		
		Map<String, String> countries = new LinkedHashMap<>();
		countries.put("Phnom Penh", "Cambodia");
		countries.put("Laos", "Vientiane");
		countries.put("Vietnam", "Saigon City");
		countries.put("USA", "Washington DC");
		countries.put("Thailand", "Bangkok");
		
		Set<String > keys = countries.keySet();
		
		for(String k:keys) {
			System.out.println(k);
		}
		System.out.println("---keys iterator--");
		Iterator<String> kk = keys.iterator();
		while(kk.hasNext()) {
			String ck = kk.next();
			System.out.println(ck);
		}
		System.out.println("----Values---");
		Collection<String> vals = countries.values();
		Iterator<String> values = vals.iterator();
		while(values.hasNext()) {
			String v1 = values.next();
			System.out.println(v1);
		}
	}
}
