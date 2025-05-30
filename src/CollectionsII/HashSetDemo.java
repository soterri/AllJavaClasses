package CollectionsII;

import java.util.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
		Set<String> breakfast = new HashSet<>();
		breakfast.add("Bacon");
		breakfast.add("pancakes");
		breakfast.add("eggs");
		breakfast.add("ba baw");
		breakfast.add("trey kneat");
		breakfast.add("eggs");
		breakfast.add("coffee");
		
		int size=breakfast.size();
		System.out.println(size);
		System.out.println(breakfast);
		
		Iterator<String> it = breakfast.iterator();
		while(it.hasNext()) {
			String elements = it.next();
			System.out.println(elements);
		}
		
		}
	}
	


