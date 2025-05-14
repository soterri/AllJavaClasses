package ExceptionsII;

public class SpecificToGeneral {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 0;
		int result;

		try {
			result = num1 / num2; // new ArithmeticException();
			System.out.println(result);
			Thread.sleep(10000);// new interruptedexception

//		}catch(Exception e) { //CE bc EXCEPTION is the parent of all the exceptions - this is general - unreachable code
//			System.out.println("Catching all types of exception");
		} catch (ArithmeticException e) {
			System.out.println("Please do not pass zero0 as a second #");
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("Someone interuppted program sleep");
		} catch (Exception e) {
			System.out.println("Catching all types of exception");

		}
		System.out.println("end of method");
	}

}
