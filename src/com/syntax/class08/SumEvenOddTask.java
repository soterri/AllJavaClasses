package com.syntax.class08;

public class SumEvenOddTask {
	public static void main(String[] args) {

		/*write a code to find the sum of even and odd numbers 
		 * 
		 */
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) {
				sumEven = sumEven + i;

			} else {
				sumOdd = sumOdd + i;
			}
		}
		System.out.println("The total of all even # "+ sumEven);
		System.out.println("The total of all odd # "+ sumOdd);
	}

}
