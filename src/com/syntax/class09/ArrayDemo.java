package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] nums = new int[4];
		nums[0] = 12;
		nums[1] = 13;
		nums[2] = 14;
		nums[3] = 15;

		System.out.println(nums.length);
		System.out.println(nums[2]);

		
		String[] array = {"Winter", "Fall", "Summer", "Spring"};
		
		System.out.println("I was born in "+array[3]);
		System.out.println(array.length);
		int arraySize = array.length;
		System.out.println(arraySize);
		}
	}

