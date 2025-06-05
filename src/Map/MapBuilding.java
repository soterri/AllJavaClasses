package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapBuilding {

	public static void main(String[] args) {
		
		HashMap<Integer, String> building = new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Amazon");
		building.put(4, "Microsoft");
		building.put(5, "Dell");
		building.put(6, "Google");
		building.put(7, "Apple");
		
		int size = building.size();
		System.out.println(size);
		System.out.println(building);
		
		//replace 
		System.out.println("REPLACE");
		String replace=building.replace(4, "Tesla");
		System.out.println(building);
		
		System.out.println("REMOVE");
		building.remove(7);
		System.out.println(building);
		
		System.out.println("------------");
		//System.out.println(building);
		
		//how to get all keys
		System.out.println("Get all keys - return one set of keys");
		Set<Integer> keys = building.keySet();
		System.out.println(keys);
		System.out.println("------****----------");
		
		Iterator<Integer> keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			int key=keysIt.next();
			System.out.println("Key is "+key+" and its value is "+building.get(key));
		}
		
		System.out.println("---getting keys using for each loop----");
		for(int k:keys) {
			System.out.println("Key from building map " +k+" and its value is "+building.get(k));
		}
		//how to get all values
		System.out.println("VALUES");
		Collection<String> values = building.values(); //the building is out "map
		//use for loop bc internally for loop is working based off iterator, logic is like iterator
		for(String v:values) {
			System.out.println(v);
		}
		System.out.println("****Iterator****");
		//map will not methods related to COLLECTIONS, to retrieve values, we will use methods value(), call method and get one obj and it will store all values 
		//which is collction<String> values bc it holds all our values if we want to use with iterator
		Iterator<String>vals = values.iterator();
		while(vals.hasNext()) {
			String valz=vals.next();
			System.out.println(valz);
		}
		
		
		
		
		Set<Entry<Integer, String>> ent = building.entrySet();
		
		System.out.println("-----------");
		Iterator<Entry<Integer, String>> buildingIt = ent.iterator();
		
		while(buildingIt.hasNext()) {
			
			Entry<Integer, String> entry = buildingIt.next();
			
			String buildingEnt = entry.getKey()+ " "+ entry.getValue();
			System.out.println(buildingEnt);
					
		}
		
	}
}
