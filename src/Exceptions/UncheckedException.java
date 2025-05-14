package Exceptions;

public class UncheckedException {
	public static void main(String[] args) {

		System.out.println("Beginning of code");
		int a = 20;
		int b = 0;

		try {
			System.out.println("Code inside TRY block");
			System.out.println(a / b); // ArithmeticException //throws
			System.out.println("Continue code inside TRY block");
		} catch (ArithmeticException e) { // ArithmeticException exception = new ArithmeticException();
			System.out.println("Inside of catch block");
			// e.printStackTrace();
			// System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("End of code");
	}
}

