package CollectionsII;

import java.util.ArrayList;
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
	}
}
