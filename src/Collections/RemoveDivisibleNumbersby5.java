package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDivisibleNumbersby5 {
	
	public static void main(String[] args) {
		
		/*create an arraylist of even numbers from 1-50
		 * using iterator remove any number that is divisible by 5
		 * from the arrayList
		 */
		
		
		//creating an object of arraylist and referring to the list
		List<Integer> numbers = new ArrayList<>();
		
		//instead of adding values 1 by 1 using add. we using for loop, storing only even numbers using loop
		for(int i=1; i<=50; i++) {
			
			if(i%2==0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers);
		
		//removing number that is divisible by 5 using iterator
		Iterator<Integer> it = numbers.iterator();
		
		while(it.hasNext()) {
			
			if(it.next()%5==0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
