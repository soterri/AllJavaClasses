package Collections;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		//create linked list of string object
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Hello");
		linkedList.add("Bye");
		linkedList.add(2, "How are you");//replaces the element in that index
		
		System.out.println(linkedList.size());
		
		for(int j=0; j<linkedList.size(); j++) {
			System.out.println(linkedList.get(j));
		}
		
		System.out.println(linkedList.get(1));
		
		//update/replace
		linkedList.set(0, "hi");
		
		//how to retrieve all values from linked list
		
		for(int i=0; i<linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		for(String lList:linkedList) {
			System.out.println(lList);
		}
		System.out.println("-------------");
		Iterator<String> it = linkedList.iterator();
		while(it.hasNext()) {//checking if there is a next element
			System.out.println(it.next());
		}
	}
}
