package Map;

import java.util.HashMap;

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
		
		//replace 
		String replace=building.replace(4, "Tesla");
		System.out.println(building);
		
		building.remove(7);
		System.out.println(building);
		
		System.out.println(building);
		
		
	}
}
