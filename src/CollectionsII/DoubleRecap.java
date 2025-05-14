package CollectionsII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DoubleRecap {
	public static void main(String[] args) {
		Set<Double> set = new LinkedHashSet<>();
		set.add(99.99);
		set.add(90.99);
		set.add(9.99);
		set.add(1.00);

		// retrieving objects:
		Iterator<Double> it = set.iterator();
		while (it.hasNext()) {

			Double d = it.next();
			if (d < 50) {
				it.remove();
			}
			System.out.println(d);
		}

		System.out.println("----------------");
		for (Double d : set) {// auto unboxing
			System.out.println(d);
		}
		
		List<String> aList = new ArrayList<>();
		aList.add("Terri");
		aList.add("Savannah");
		aList.add("Cameron");
		aList.add("Ange");
		aList.add("Max");
		aList.add("Sophy");
		
		Set<String> hset = new HashSet<>();
		hset.addAll(aList);
		System.out.println(hset);
		
		aList.clear();
		System.out.println(aList);
		aList.addAll(hset);
		System.out.println(aList);
		
		//how to access just 1 value from the set collection
		Set<String> lset = new LinkedHashSet<>();
		lset.add("Morning");
		lset.add("Noon");
		lset.add("Evening");
		lset.add("Night");
		//convert to arrayList
		List<String> myList = new ArrayList<>();
		myList.addAll(lset);
		String element=myList.get(1);
		System.out.println(element);
		 
		//another way to create an object of arrayList by passing values to the constructor
		List<String> myList1 = new ArrayList<>(lset);
	}
}
