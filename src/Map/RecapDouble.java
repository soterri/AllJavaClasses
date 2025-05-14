package Map;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RecapDouble {

	public static void main(String[] args) {

		Set<Double> set = new LinkedHashSet<>();
		set.add(99.99);
		set.add(90.99);
		set.add(9.99);
		set.add(49.00);
		set.add(100.00);
		set.add(5.50);

		Iterator<Double> it = set.iterator();
		while (it.hasNext()) {
			double d = it.next();
			if (d < 50) {
				it.remove();
			}
		}

		System.out.println("advanced for loop");
		for (double d1 : set) {
			System.out.println(d1);
		}
	}
}
