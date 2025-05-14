package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class RetrieveAlll {

	public static void main(String[] args) {

		// create a map of a classroom in which we will store objects and its quantities

		Map<String, Integer> classRoom = new LinkedHashMap<>();
		classRoom.put("Instructors", 3);
		classRoom.put("Student", 80);
		classRoom.put("Tables", 20);
		classRoom.put("Chair", 80);
		
		System.out.println(classRoom);
		
		//Set<String> keys = classRoom.keySet();
		
		Set<Entry<String, Integer>> entrySet = classRoom.entrySet(); //returns a set of entry objects
		
		System.out.println("using for each loop to get all entry objects");
		for(Entry<String, Integer> entry:entrySet) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
				
			
		}
		System.out.println("---------------Iterator to print all entry objects-------------");
		
//		Iterator<Entry<String, Integer>> entryIt = entrySet.iterator();
//		
//		while(entryIt.hasNext()) {
//			
//			Entry<String, Integer> entry = entryIt.next();
//			
//			String ent=entry.getKey()+"--"+entry.getValue();
//			System.out.println(ent);
//		}
		
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			
			Entry<String, Integer> ent = entryIterator.next();
			String entry=ent.getKey()+"--"+ent.getValue();
			System.out.println(entry);
		}
		
	}

}
