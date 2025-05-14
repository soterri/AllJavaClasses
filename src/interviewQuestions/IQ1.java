package interviewQuestions;

public class IQ1 {
	/*
	 * Write a program to swap 2 numbers without a temporary variable. Swap 2
	 * strings without a temp. variable
	 */

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		a = a + b; // 30
		b = a - b; // 30-20=10
		a = a - b; // 30-10=20
		System.out.println("The value of a " + a + " and the value of b " + b);

		//using arithmetic operators and variables can change the value of the variable.
		//using reassigning the values to the variables
		String str1 = "yurpp";
		String str2 = "bye";

		str1 = str1 + str2; //HelloBye
		str2 = str1.substring(0, 5); //Hello	
		str1 = str1.substring(5);//Bye

		System.out.println(str1);
		System.out.println(str2);

		// 2nd way
//		str1=str1+str2;
//		str2=str1.substring(0, str1.length()-str2.length());
//		str1=str1.substring(str2.length());

	}

}
