package Map;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		//to store values - use method put 
		HashMap<Integer, String> ppl = new HashMap<>();
		ppl.put(101, "Sotheary");
		ppl.put(101, "Cameron");
		ppl.put(102, "Terri");
		ppl.put(103, "Sophy");
		ppl.put(104, "Max");
		ppl.put(105, "Savannah");
		ppl.put(106, "Ange");
		ppl.put(109, "Terri");
		System.out.println(ppl);

//		//how to verify if there are elements inside map
		boolean map = ppl.isEmpty();

		if (!map) {
			int size = ppl.size();
			System.out.println(size);
		}

//		System.out.println("Adding more entries");
//		//adding more entries
		ppl.put(107, "Cameron");
		ppl.put(108, "Sotheary");
		//ppl.put(107, "Angie"); can not store duplicates keys
		System.out.println(ppl);

//		
//		//how to access a value
		String mapElement = ppl.get(105);
		System.out.println(mapElement);
//		
//		//to replace or update value
		String replace = ppl.replace(106, "Angelina");
		System.out.println(replace);
//		
//		//how to remove an object from the map
		String remove = ppl.remove(101);
		System.out.println(remove);
//		
//		//how to verify if certain key exists
		System.out.println("-------------");
		boolean flag = ppl.containsKey(103);
//		
		if (flag) {//if key is there replace it key 102 with value "terri"
			ppl.replace(102, "terri");
		} else { //if not then put 102,"Sotheary"
			ppl.put(102, "Sotheary");
		}
		System.out.println(ppl);

		boolean containz =  ppl.containsValue("Savannah");
		System.out.println(containz);
		
		boolean contains = ppl.containsValue("Sophy");
		System.out.println(contains);
		//System.out.println(ppl);
//	}
//	
//	
//	
//
	}
}

//cannot have duplicate keys but can have duplicate values