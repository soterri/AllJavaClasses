package com.syntax.class15;

public class MethodsArray {
	
	//create a method that will accept array of intergers and return max element from array
	
	int getLargesNumber(int[] array) {
		
		int largest=array[0];
		
		for(int i=1; i<array.length; i++) {
			if(array[i]>largest) {
				
				largest=array[i];
			}
		}
		return largest;
	}
	//create a method that will accept a string return each word from a given string
	
	String[] getWordsFromString(String str) {
		
		String[] array=str.split(" ");
		
		return array;
	}

	public static void main(String[] args) {
		
		MethodsArray obj = new MethodsArray();
		int[] array= {50,800,55};
		System.out.println(obj.getLargesNumber(array));
		
		int[]arr1 = {54,88,95};
		System.out.println(obj.getLargesNumber(arr1));
		
		String myString = "John's a dumb bitch";
		String[] words=obj.getWordsFromString(myString);
		
		
		for(String word:words) {
			System.out.println(word);
		}
		
		String myStr = "John's a fucking hoe and deadbeat";
		String[] arrayz=obj.getWordsFromString(myStr);
		
		for(String arrs:arrayz) {
			System.out.println(arrs);
		}
		
		
		}
		
	}
