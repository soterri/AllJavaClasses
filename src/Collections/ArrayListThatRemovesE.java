package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

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

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {

			if (iterator.next().endsWith("e")) {
				iterator.remove();
			}
		}
		System.out.println(list);

	}

}
