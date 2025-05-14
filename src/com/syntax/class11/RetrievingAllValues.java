package com.syntax.class11;

public class RetrievingAllValues {
	public static void main(String[] args) {
		
		int[][] nums = {
				
				{50,80,90,98},
				{100,500,58,98},
				{17,58,44,88}
		};
		
		int rows = nums.length;
		System.out.println(rows);

		int cols = nums[0].length;
		System.out.println(cols);
	}
}
