package Collections;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemoo {

	public static void main(String[] args) {
		
		LinkedList<String> llist = new LinkedList<>();
		llist.add(0, "Terri");//comes from list
		llist.add("Cameron");//comes from collection
		llist.add("Savannah");
		llist.add("Ange");
		llist.add("Max");
		llist.add("Sophy");
		
		int size=llist.size();
		System.out.println(size);
		
		//get all elements 1 by 1 in different ways
		
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		
		for(String names:llist) {
			System.out.println(names);
		}
		Iterator<String> it = llist.iterator();
		while(it.hasNext()) {
			String elements=it.next();
			System.out.println(elements);
			
		}
		
		
		
	}	
}
