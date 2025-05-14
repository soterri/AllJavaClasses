package com.syntax.class11;

public class Large {

	public static void main(String[] args) {

		int[] nums = { 5000, 160, 800 };
		
		int largest = nums[0];
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i]>largest) {
				largest = nums[i];
			}
			
		}
		System.out.println(largest);

	}
}

//4000 2229 6025 2817
//11/27
//746
