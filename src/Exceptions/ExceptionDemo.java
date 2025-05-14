package Exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		division2Integers(5, 0);
		division2Integers(20, 10);
		division2Integers(5, 5);
		
	}
	
	public static void division2Integers(int num1, int num2) {
		
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("cant divide by zero, please provide valid number");
			System.out.println(e);
			//e.printStackTrace();
		}
	}
}
