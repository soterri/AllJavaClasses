package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		// to store values inside collection - add.
		arrayList.add("Terri");
		arrayList.add("Savannah");

		// to retrieve values from arrayList
		System.out.println(arrayList.get(1));

		// adding more values
		arrayList.add("Sophy");
		arrayList.add("Cameron");
		arrayList.add("Max");
		arrayList.add("Ange");

		// how many elements inside arrayList?
		int size = arrayList.size();
		System.out.println(size);

		// creating an object of arraylist that will hold numeric values
		ArrayList<Integer> numArrList = new ArrayList<>();
		numArrList.add(1);
		numArrList.add(200);
		numArrList.add(300);

		System.out.println(numArrList.get(2));

		// retrieving values
		// int num = control or counter variable -> controls # of iterations
		for (int num = 0; num < numArrList.size(); num++) {
			System.out.println(numArrList.get(num));
		}

		System.out.println("BACKWARDS");
		// backwards

		for (int i = numArrList.size() - 1; i >= 0; i--) {
			System.out.println(numArrList.get(i) + " ..........");

		}

		System.out.println(numArrList.get(2));

		System.out.println("--for loop--");

		for (Integer num : numArrList) {
			System.out.println(num);

		}

		for (String ent : arrayList) {
			System.out.println(ent);

		}
		System.out.println();
		System.out.println("---------------");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		// arrayList can have generic and non generic
		ArrayList aList = new ArrayList();
		aList.add("Hello");
		aList.add(1250);
		aList.add(10.10);
		aList.add(true);
		System.out.println(aList);

	}
}