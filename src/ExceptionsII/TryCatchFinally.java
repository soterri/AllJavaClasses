package ExceptionsII;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		division(10, 0);
	}
	public static int division(int num, int num2) {
		
		int result=0;
		
		try {
			result = num/num2;//new ArithmeticException
			//System.out.println(num/num2);
		}catch(ArithmeticException ae ) {
			ae.printStackTrace();//take the variable that refers to the obj of the arithmeticexception and can call method printstacktrace 
			//that will give us a detailed msg of our exception such as name of exception, msg, and location of exception 
			String message = ae.getMessage();
			System.out.println(message);
		}
		return result;
		
	}
}
