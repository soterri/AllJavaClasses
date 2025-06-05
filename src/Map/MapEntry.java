package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {
	public static void main(String[] args) {
		
		//create a map that will store month and days in a month
		
		Map<String, Integer> month = new LinkedHashMap<>();
		month.put("January", 30);
		month.put("February", 29);
		month.put("March", 31);
		month.put("April", 30);
		month.put("May", 31);
		month.put("June", 30);
		month.put("July", 31);
		
		int size=month.size();
		System.out.println(size); //gives number of entries
		
		//get all entries from a map
		Set<Entry<String, Integer>> entries = month.entrySet();
		
		//loop through all entry objects
		for(Entry e:entries) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		//iterate through all entry objects
		Iterator<Entry<String,Integer>> entriess = entries.iterator();
		while(entriess.hasNext()) {
			
			Entry<String, Integer> e = entriess.next();
			
			String keys = e.getKey();
			Integer values = e.getValue();
			System.out.println(keys+" - "+values);
			
			
		}
		
	}
}
