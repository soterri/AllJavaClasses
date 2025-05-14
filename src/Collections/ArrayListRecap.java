package Collections;

import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class ArrayListRecap {
	public static void main(String[] args) {

		// lets create an arraylist to store numbers
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(100);
		aList.add(200);
		aList.add(300);
		aList.add(400);//index 3 but size=4 elements but index -1 
		
		int size = aList.size();
		System.out.println(size);
		
		int element=aList.get(2); //automatic unboxing, numbers.get(2) is object, unwrapping obj and storing inside primitive type
		
		//to add more numbers
		aList.add(500);
		
		//to remove an element
		aList.remove(0);
		//System.out.println(aList);
		
		for(int num:aList) {//take each element(alist) and store it inside num variable and converting to primitive type - auto unboxing happens automatically
			System.out.println(num);
		}
		System.out.println("-----------------");
		for(int i=0; i<aList.size(); i++) {
			System.out.println(aList.get(i));
			
			
		}
		System.out.println("----");
		//print elements backwards
		for(int i=aList.size()-1; i>=0; i--) {
			System.out.println(aList.get(i));
			
			
		}
		System.out.println("---iterator---");
		Iterator<Integer> it = aList.iterator();
		while(it.hasNext()) { //when we don't know the # of iterations; go for while loop
			int number = it.next();
			if(number %2==0) {
				System.out.println(number);
			}
			System.out.println("-------------");
			Iterator<Integer> itList = aList.iterator();
			while(itList.hasNext()) {
				System.out.println(itList.next());
			}
		}
		
		

	}
}