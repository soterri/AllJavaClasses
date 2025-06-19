package Exceptions;

public class ExceptionIntro {
	
	public static void main(String[] args) {
		
		int a= 20;
		int b =0;
		
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("CODE AFTER AN EXCEPTION");
		}
		
		System.out.println("Continues code");

//		
//		NullPointerException npe = new NullPointerException();
//		throw(npe);
		
		//int[] array = {10,20,30};
		//System.out.println(array[3]);
		
		//ArithmeticException exception = new ArithmeticException();
		//throw(exception);
	}

}
