package Map;

import java.util.HashMap;

public class MapIntro {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> ppl = new HashMap<>();
		ppl.put(101, "John");
		ppl.put(102, "Terri");
		ppl.put(103, "Sophy");
		ppl.put(104, "Max");
		ppl.put(105, "Savannah");
		ppl.put(106, "Ange");
		
		System.out.println(ppl);
		
		//how to verify if there are elements inside map
		boolean map = ppl.isEmpty();
		
		if(!map) {
			int size = ppl.size();
			System.out.println(size);
		}
		//adding more entries
		ppl.put(107, "Cameron");
		System.out.println(ppl);
		
		//how to access a value
		String mapElement=ppl.get(105);
		System.out.println(mapElement);
		
		//to replace or update value
		ppl.replace(106, "Angelina");
		System.out.println(ppl);
		
		//how to remove an object from the map
		ppl.remove(101);
		System.out.println(ppl);
		
		//how to verify if certain key exists
		boolean flag = ppl.containsKey(103);
		
		if(flag) {
			ppl.replace(102, "Soterri");
		}else {
			ppl.put(102, "Sotheary");
		}
		System.out.println(ppl);
		
		//how to verify if certain VALUE exists
		boolean contains= ppl.containsValue("Savannah");
		System.out.println(contains);
		System.out.println(ppl);
	}
	
	
	

}

//cannot have duplicate keys but can have duplicate values