package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRecap {

	public static void main(String[] args) {
		
		//create a map of countries with capitals
		Map<String, String> hmap = new HashMap<>();
		hmap.put("USA", "Washington DC");
		hmap.put("Cambodia", "Phnom Penh");
		hmap.put("Vietnam", "Saigon City");
		//System.out.println(hmap);
		
		Collection<String> capitals = hmap.values();
		
		for(String cap:capitals) {
			System.out.println(cap);
		}
		
		Set<String> keySet = hmap.keySet();
		
		for(String k:keySet) {
			System.out.println(k);
		}
		
	}
}
