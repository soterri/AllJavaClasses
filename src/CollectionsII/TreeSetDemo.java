package CollectionsII;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<String> fruitSet = new TreeSet<>();
		fruitSet.add("Apple");
		fruitSet.add("mango");
		fruitSet.add("bananas");
		fruitSet.add("Apple");
		fruitSet.add("kiwi");
		fruitSet.add("apple");

		System.out.println(fruitSet.size());
		System.out.println(fruitSet);
	}
}
