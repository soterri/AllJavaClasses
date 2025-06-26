package Exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaticMethodsExceptionsTask {

	/*
	 * Create a static method that will return a list of exceptions inside your
	 * method create objects of 4 exception classes using try and catch blocks and
	 * store them inside your list. call your method inside main and print name and
	 * details of all exception details
	 */
	public static void main(String[] args) {

		List<Exception> list = getAllExceptions();
		System.out.println(list.size());
		
		System.out.println("Using Iterator");
		Iterator<Exception> it = list.iterator();
		while(it.hasNext()){
			//it.next().printStackTrace();
		String msg= it.next().getMessage();
		System.out.println(msg);
		}
		System.out.println("for loooppp");
		for(Exception l:list) {
			System.out.println(l);
		}
	}

	public static List<Exception> getAllExceptions() {
		List<Exception> exceptionList = new ArrayList<>();

		int[] array = { 1, 2, 3 };
		try {
			System.out.println(array[3]);
		} catch (ArrayIndexOutOfBoundsException aob) {
			exceptionList.add(aob);
		}

		try {
			Object obj = new Double(50);
			Integer i = (Integer) obj;
		} catch (ClassCastException cce) {
			exceptionList.add(cce);
		}
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			exceptionList.add(e);
		}
		try {
			int[] negArray = new int[-1];

		} catch (NegativeArraySizeException ne) {
			exceptionList.add(ne);
		}

		return exceptionList;

	}

}
