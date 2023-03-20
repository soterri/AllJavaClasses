package Collections;

import java.util.ArrayList;

public class Iterator {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Sophy");
		arrayList.add("Vanna");
		arrayList.add("Meuandane");
		
		//to retrieve values from ArrayList using FOR LOOP
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		//using enhanced for loop
		
		for(String array:arrayList) {
			System.out.println(array);
		}
		//USING ITERATOR
//		Iterator<String> it = arrayList.iterator();
//		System.out.println(arrayList);
		
	}

}
