package Map;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

	public static void main(String[] args) {
		
		Map<Integer, String> building = new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Microsoft");
		building.put(4, "Tesla");
		building.put(5, "Apple");
		building.put(5, "Google");
		
		System.out.println(building.size());
		
		building.replace(4, "X");
		System.out.println(building);
		
		building.remove(5);
		
		System.out.println(building);
		
	}
}
