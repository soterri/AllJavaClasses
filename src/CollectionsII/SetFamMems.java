package CollectionsII;

import java.util.*;

public class SetFamMems {

	public static void main(String[] args) {

		Set<String> fruitSet = new LinkedHashSet<>();
		fruitSet.add("apple");
		fruitSet.add("banana");
		fruitSet.add("cherries");
		fruitSet.add("oranges");
		fruitSet.add("grapes");
		fruitSet.add("banana");
		fruitSet.add("apple");

		System.out.println(fruitSet.size());
		System.out.println(fruitSet);

		Set<Integer> tset = new TreeSet<>();
		tset.add(1000);
		tset.add(200);
		tset.add(3500);
		tset.add(400);
		tset.add(200);

		System.out.println(tset.size());
		System.out.println(tset);
		
		
		System.out.println("---------arraylist without duplicates--------------------");
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Apple");
		arrayList.add("Cherry");
		arrayList.add("Banana");

		// Convert ArrayList to LinkedHashSet to remove duplicates and maintain order
		Set<String> set = new LinkedHashSet<>(arrayList);

		// Convert back to ArrayList
		List<String> arrayListWithoutDuplicates = new ArrayList<>(set);

		System.out.println("ArrayList without duplicates: " + arrayListWithoutDuplicates);
	}

}
