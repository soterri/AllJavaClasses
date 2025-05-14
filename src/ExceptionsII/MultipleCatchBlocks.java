package ExceptionsII;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		division(12, 0);
		division(12, 2);
		
	}
		public static void division(int num1, int num2) {
			
			int result; //declaring variable
			
			try {
				result=num1/num2;
				System.out.println(result);
				Thread.sleep(5000);//new InterruptedException
			}catch(ArithmeticException e) {
				System.out.println("Please do not pass zero as a second #");
				System.out.println(e);
			}catch(InterruptedException e) {
				System.out.println("Someone interuppted program sleep");
			}catch(Exception e) {
				System.out.println("Catching all types of exception");
			}
			System.out.println("end of method");
	}
}
