package Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//create linked list of string object
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Hello");
		linkedList.add("Bye");
		
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
	}
}
