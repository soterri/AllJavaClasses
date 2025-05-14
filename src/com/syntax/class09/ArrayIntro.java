package com.syntax.class09;

public class ArrayIntro {
	public static void main(String[] args) {
		
		int a; //declaration
		a=10; //assigning value or initializing variable
		
		int a1=10; //all in one line 
		
		int[] b;//declaring an array
		
		b= new int[4];//initializing array store 4 elements 
		
		int[] array = new int[5]; //declaration and initialization
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		System.out.println(array[4]);
		
		//array that stores Strings
		String[] classes = new String[5];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="GIT";
		classes[3]="Manual Testing";
		classes[4]="SQL";
		System.out.println("I am learning "+classes[0]);
		
		//changing elements
		int[] nums = new int[4];
		nums[0]=10;
		nums[1]=100;
		nums[0]=1000;
		nums[0]=2000;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[1]);
		
		//creating an array of strings
		String[] names = new String[6];
		names[0]="Cameron";
		names[1]="Terri";
		names[2]="Ange";
		names[3]="Max";
		names[4]="Sophy";
		names[5]="Savannah";
		System.out.println(names[5]);
		
		
		//the size of an array is fixed!!

	}
}
