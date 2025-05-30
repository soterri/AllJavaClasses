package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class DivisibleTask {
	public static void main(String[] args) {

		// create an arraylist of even numbers from 1-50. using iterator
		// remove any number that is divisible

		ArrayList<Integer> nums = new ArrayList<>();

		for (int x = 0; x <= 50; x += 2) {
			nums.add(x);
		}
		System.out.println(nums);

		Iterator<Integer> it = nums.iterator();
		while (it.hasNext()) {

			if (it.next() % 5 == 0) {
				it.remove();

			}
		}
	}

}
