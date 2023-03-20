package Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RetrieveAll {

	public static void main(String[] args) {
		
		//Create a map of a person(name, lastName, address, city, state)
		
		Map<String, String> personMap = new LinkedHashMap<>();
		personMap.put("LastName", "Thach");
		personMap.put("Name", "Sotheary");
		personMap.put("Address", "2507 20th Rd N");
		personMap.put("City", "Arlington");
		personMap.put("State", "VA");
		System.out.println(personMap);
		
	//retrieving a specific value
		String state=personMap.get("State");
		System.out.println(state);
		
		//how to retrieve all keys and all values
		Set<String>keys=personMap.keySet();
		System.out.println("--------------");
		
		for(String key:keys) {
			System.out.println(key+" : "+personMap.get(key));
		}
		System.out.println("-----------------------*************");
		Iterator<String> keysIt=keys.iterator();
		
		while(keysIt.hasNext()) {
			
			System.out.println(keysIt.next());
		}
		System.out.println("printing all values");
		
		Collection<String> values = personMap.values();
		
		for(String vals:values) {
			System.out.println(vals);
		}
		
		System.out.println("VALUES ITERATOR");
		Iterator<String> valsIt = values.iterator();
		
		while(valsIt.hasNext()) {
			
			System.out.println(valsIt.next());
		}
		
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			
			String mapKey = keysIterator.next();
			String mapValue = personMap.get(mapKey);
			
			System.out.println(mapKey+"-"+mapValue);
		}
		
	
		
		//how can i retrieve and print values in key:value
//		for(String key:keys) {
//			System.out.println(key+" : "+personMap.get(key));
		}
	}
	
	
