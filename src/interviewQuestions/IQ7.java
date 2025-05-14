package interviewQuestions;

public class IQ7 {

	public static void main(String[] args) {
		
		/*
		 * Write a java program to check whether a given number is prime or not?
		 * prime: is a numbers that has to meet 2 conditions
		 * it should be divisible by 1 and by itself only
		 * 2,3,5,7,11,13,17,19,23
		 */
		
		// take a range of numbers from 2 to 100 and print all prime numbers


		int num = 1;
		boolean isPrime = true;

		if (num == 0 || num == 1) {
			isPrime = false;
		} else {

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					isPrime = false;
				}
			}
		}

			if (isPrime) {
				System.out.println(num + " is a prime number");
			} else {
				System.out.println(num + " is not a prime nnumber");
			}
		}
	
}
