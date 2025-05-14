package com.syntax.class15;

public class MethodWithReturnValue {
	
	public static void main(String[] args) {
		
//		String str = "Welcome home";
//		int size=str.length();
//		System.out.println(size);
		
		/*declare a String and if String has more then 10 characters
		 * String is large otherwise (if) String is small
		 */
		
		String str = "Welcome home";
		int numOfChars=str.length(); //returns a numeric value, trying to store inside variable and the variable
		//is of integer type, so if method returns something we can store it somewhere
		
		if(numOfChars>=10) {
			System.out.println("String is large");
		}else {
			System.out.println("String is small");
		}
		char character=str.charAt(4); //returns a single character and can store inside a variable
		
		//create an obj of the class where method is defined
		RecapOfMethods1 obj = new RecapOfMethods1();
		obj.sum(10, 20);
		
		System.out.println("------Return--------");
		MethodWithReturnValue obj1 = new MethodWithReturnValue();
		int sum=obj1.sum(20, 40);
		System.out.println("Using return - sum is: "+ sum);
		int large=obj1.findLargest(20, 15);
		System.out.println(large);
		
		
	}
	//return type, method name(list of parameters)
	int sum(int num1, int num2) {
		int c= num1+num2;
		return c;
	}
	
	//method to find largest number
	
	int findLargest(int num1, int num2) {
		
		int largest;
		
		if(num1>num2) {
			largest=num1;;
		}else {
			largest = num2;
		}
		//System.out.println(largest);
		return largest;
	}
	
}
