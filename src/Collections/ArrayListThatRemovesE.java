package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListThatRemovesE {

	public static void main(String[] args) {

		/*
		 * create an arrayList of words remove every words that ends with 'e' use
		 * iterator to traverse through the collection
		 */

		List<String> list = new ArrayList<>();
		list.add("everything");
		list.add("Cute");
		list.add("mute");
		list.add("Hello");
		list.add("biznyeee");


		Iterator<String> it = list.iterator();//Iterator - class //iterator() - a method
		while(it.hasNext()) {
			
			if(it.next().endsWith("e")) {
				it.remove();
			}
		}
		System.out.println(list);
		}
}