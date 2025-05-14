package CollectionsII;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetFamilyMembers {
	public static void main(String[] args) {

		Set<String> fruitSet = new LinkedHashSet<>();
		fruitSet.add("Apple");
		fruitSet.add("mango");
		fruitSet.add("bananas");
		fruitSet.add("Apple");
		fruitSet.add("kiwi");
		fruitSet.add("mango");

		System.out.println(fruitSet.size());
		// System.out.println(fruitSet);

		System.out.println("iterator");
		Iterator<String> it = fruitSet.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}
			
			//adding collection into a collection
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("selenium");
		list.add("testNG");
		
		Set<String> linkedSet = new LinkedHashSet<>();
		linkedSet.addAll(fruitSet);
		linkedSet.addAll(list);
		
		System.out.println("---objects from both collections----");
		System.out.println(linkedSet);
		}
	}


