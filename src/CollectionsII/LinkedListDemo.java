package CollectionsII;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<>();
		llist.add("Hello");
		llist.add("Bye");
		llist.add("Hello");
		llist.add("Bye");
		llist.add("How are you");
		System.out.println(llist);

		// to retrieve one element
		String element = llist.get(2);
		System.out.println(element);

		// replace 1 element
		llist.set(0, "hiiii");
		System.out.println(llist);

		// retrieve all elements
		for (int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		System.out.println("--------------------");

		for (String el : llist) {
			System.out.println(el);
		}
		System.out.println("----ITERATOR-----");
		
		Iterator<String> it = llist.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}
}
