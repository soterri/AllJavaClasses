package CollectionsII;

import java.util.HashSet;
import java.util.Iterator;

public class Veggies {

	public static void main(String[] args) {
		
		/*lets create a collection of veggies
		 * where I do not want duplicates
		 */
		
		HashSet<String> hset = new HashSet<>();
		
		//storing values into hashset
		hset.add("cucumber");
		hset.add("onions");
		hset.add("green pepper");
		hset.add("zucchini");
		hset.add("green pepper");
		hset.add("onions");
		
		System.out.println(hset.size());
		System.out.println(hset);
		
		//set does not have methods to retrieve elements from collection
		//.get .set only belongs to list interface
		//how can we retrieve all values? ITERATOR
		
		Iterator<String> it = hset.iterator();
		
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		System.out.println("*****************");
		//enhanced for loop
		for(String el:hset) {
			System.out.println(el);
		}
	}
}
