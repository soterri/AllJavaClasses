package Collections;

import java.util.ArrayList;


public class CollectionsRecap {

	public static void main(String[] args) {
		// Create an arrayList to store numbers

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(1000);//index=3 size = 4

		int size = arrayList.size();
		System.out.println(size);

		// add more
		arrayList.add(10000);
		// to remove
//		arrayList.remove(size - 1);
//		arrayList.remove(1);
//		System.out.println(arrayList);

		// to retrieve values from an arrayList
		int element = arrayList.get(0);
		System.out.println(element);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("Enhanced Loop");
		for (Integer ints : arrayList) {
			System.out.println(ints);
		}
		//getting values backwards
		System.out.println("Backwards");
		for(int i=arrayList.size()-1; i>0; i--) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("Iterator");
		java.util.Iterator<Integer> iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		

		
	}

}
