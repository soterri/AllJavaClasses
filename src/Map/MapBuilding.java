package Map;

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
		System.out.println(building);
		
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
