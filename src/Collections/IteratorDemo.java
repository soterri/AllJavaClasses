package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		strList.add("Terri");
		strList.add("Sophy");
		strList.add("Ange");
		strList.add("Max");
		strList.add("Cameron");
		strList.add("Savannah");
		
		//retrieve values from an arrayList
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
			
		}
		
	
		for(String str:strList) {
			System.out.println(str);
		}
		System.out.println("----Iterator----");
		//iterable interface - inside it has 3 methods - hasNext(); next(); remove();
		Iterator<String> it = strList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
