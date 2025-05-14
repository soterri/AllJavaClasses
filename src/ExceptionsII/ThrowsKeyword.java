package ExceptionsII;

public class ThrowsKeyword {
	
	public static void main(String[] args) {
		System.out.println("Beginning");
		callingExceptionMethod();
		System.out.println("End");
	}
	public static void throwingException() {
		System.out.println("Creating an exception");
		ArithmeticException ae = new ArithmeticException();
		throw(ae);
	}
	public static void callingExceptionMethod() {
		try {
			throwingException();
			
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception got caught");
		}
	}

}

//throws keyword that is used to handle responsibilities of handling exceptions to the caller
//just passing it on if you don't want to handle it