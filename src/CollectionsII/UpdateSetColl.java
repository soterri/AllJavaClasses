package CollectionsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UpdateSetColl {

	public static void main(String[] args) {
		
		List<String> aList = new ArrayList<>();
		aList.add("Cameron");
		aList.add("Savannah");
		aList.add("Sophy");
		aList.add("Max");
		aList.add("Ange");
		
		//to rid of duplicates, store to set
		Set<String> hset = new HashSet<>();
		hset.addAll(aList);
		System.out.println(hset);
		
		//Access/update just 1 value from the Set collection
		Set<String> lset= new LinkedHashSet<>();
		lset.add("Morning");
		lset.add("Evening");
		lset.add("Evening");
		lset.add("Noon");
		lset.add("Night");
		
		//convert to ArrayList
		List<String> myList = new ArrayList<>();
		myList.addAll(lset);
		String element =  myList.get(2);
		System.out.println(element);
		
		//another way to create an object of arraylist by passing value to the constructor
		List<String> myList1 = new ArrayList<>(lset);
		System.out.println(myList1);
		
		//another way to get 1 value from set
		if(lset.contains("Night")) {
			System.out.println("Contains night");
			
		List<String> myList2 = new ArrayList<>(lset);
		String set=myList2.get(3);
		System.out.println(set);
		
		//convert to array
		Object[] array = lset.toArray();
		System.out.println(array[3]);
		
		//to sort elements of any collection
		Collections.sort(myList);
		System.out.println(myList);
		
		}
		
	}
}
