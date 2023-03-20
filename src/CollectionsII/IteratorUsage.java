package CollectionsII;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorUsage {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("Terri");
		stringList.add("Sophy");
		stringList.add("Savannah");
		stringList.add("Ange");
		stringList.add("Max");
		
		//remove names that are shorter than 4 characters
		
//		for(int i=0; i<stringList.size(); i++) {
//			
//			if(stringList.get(i).length()<4) {
//				stringList.remove(i);
		//better to use iterator!! 
		Iterator<String> it = stringList.iterator();
		
		while(it.hasNext()) {
			
			if(it.next().length()<=4) {
				it.remove();
			}
		}
		System.out.println(stringList);
	
		
	}
}
