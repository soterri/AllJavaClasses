package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		//to store values inside collection - add.
		arrayList.add("Terri");
		arrayList.add("John");
		
		//to retrieve values from arrayList
		System.out.println(arrayList.get(1));
		
		//adding more values
		arrayList.add("Sophy");
		arrayList.add("Savannah");
		
		//how many elements inside arrayList?
		int size = arrayList.size();
		System.out.println(size);
		
		//creating an object of arraylist that will hold numeric values
		ArrayList<Integer> numArrList = new ArrayList<>();
		numArrList.add(1);
		numArrList.add(200);
		numArrList.add(300);
		
		for(int num=0; num<numArrList.size(); num++) {
			System.out.println(numArrList.get(num));
		}
		
		System.out.println(numArrList.get(1));
		
		
		
		for(String arrz:arrayList) {
			System.out.println(arrz);
		}
		
	}

}
