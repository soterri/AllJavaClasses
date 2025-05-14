
package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapElectronics {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();
		map.put(1234, "Mac Laptop");
		map.put(4567, "HP Printer");
		map.put(8910, "Dell Screen");
		map.put(1112, "Samsung TV");

		System.out.println(map);

		// to retrieve key - values using entry set

		Set<Entry<Integer, String>> set = map.entrySet();

		for (Entry<Integer, String> entry : set) {

			String ent = entry.getKey() + " ---- " + entry.getValue();
			System.out.println(ent);
		}
		
		
		
		
		System.out.println("ITERATOR");
		Iterator<Integer> electronicMap = map.keySet().iterator();
		while(electronicMap.hasNext()) {
			
			Integer itKey = electronicMap.next();
			String itVal = map.get(itKey);
			System.out.println(itKey+"--"+itVal);
		}

		System.out.println("------------------");
		
		Iterator<Entry<Integer, String>> entryIterator = map.entrySet().iterator();
		while(entryIterator.hasNext()) {
			Entry<Integer, String> singleEntry = entryIterator.next();
			System.out.println(singleEntry.getKey()+"---"+singleEntry.getValue());
		}
	}
}



//Iterator<Integer> electronicMap = map.keySet().iterator();
//
//while(electronicMap.hasNext()) {
//	
//	Integer itKey = electronicMap.next();
//	String itValue = map.get(itKey);
//	
//	System.out.println(itKey+" --- "+itValue);
//}




//Set<Entry<Integer, String>> set = map.entrySet();
//
//for(Entry<Integer, String> entry:set) {
//	
//	String ent=entry.getKey()+"*****"+entry.getValue();
//	System.out.println(ent);
//	
//}
