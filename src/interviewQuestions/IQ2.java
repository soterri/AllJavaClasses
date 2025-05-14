package interviewQuestions;

import java.util.Arrays;

public class IQ2 {
	public static void main(String[] args) {

		/*
		 * Write a java program to find the second largest number in the array. What's the  Max and
		 * Min number in array?
		 * 
		 * I will use the sort method. It will sort out my array from lowest value to
		 * largest value. to get min will get first element from array and will not
		 * hard code will use the property of array using length - 1
		 */

		int[] array = { 100, -90, 8787, 0, 10, 25 };
		
		Arrays.sort(array);
		
		int min = array[0];
		int max = array[array.length-1];
		System.out.println(min+" "+max);
//
//		Arrays.sort(array);
//
//		int min = array[0];
//		int max = array[array.length - 1];
//
//		System.out.println(min + " " + max);

		
		// 2nd way

		int[] myArray = { 100, -90, 8787, 0, 10, 25 };
		int largest = myArray[0];
		int smallest = myArray[0];

		for (int i = 0; i < myArray.length; i++) {

			if (myArray[i] > largest) {
				largest = myArray[i];

			}
			if (myArray[i]<smallest) {
				smallest = myArray[i];
			}
		}
		System.out.println("smallest = "+smallest);
		System.out.println("largest = "+largest);
		
		int[] nums = { 100, -90, 8787, 0, 10, 25 };
		int large = nums[0];
		int secLarge = nums[0];
		
		for (int j=0; j<nums.length; j++) {
			
			if(nums[j]>large) {
				secLarge = large;
				large = nums[j];
			}
			if(nums[j]>secLarge &&nums[j]<large) {
				secLarge = nums[j];
				
			}
			
		}
		System.out.println(large);
		System.out.println(secLarge);
	}

}

/*taking each element and comparing it.
*first, i would create the largest variable, i will assign it to the first element of my array
*and then ill create another integer variable and assign it also to my first element inside my array
 then using for loop, i will start looping from the first position til how many elements are there in my array
 and then will throw 2 if conditions then each element inside looop will be compared to the largest, once condition is true
 i will reassign the value of the largest variable and same thing from the smallest variable.
*/

