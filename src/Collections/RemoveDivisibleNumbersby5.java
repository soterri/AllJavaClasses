package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class RemoveDivisibleNumbersby5 {
	
	public static void main(String[] args) {
		
		/*create an arraylist of even numbers from 1-50
		 * using iterator remove any number that is divisible by 5
		 * from the arrayList
		 */
		
		List<Integer> numbers = new ArrayList<>();
		
		for(int i=1; i<=50; i++) {
			
			if(i%2==0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers);
		
		Iterator<Integer> it = numbers.iterator();
		
		while(it.hasNext()) {
			
			if(it.next()%5==0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
