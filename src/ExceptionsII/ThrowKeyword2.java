package ExceptionsII;

public class ThrowKeyword2 {
	public static void main(String[] args) {
		
		ThrowKeyword2 tk = new ThrowKeyword2();
		tk.checkAge(15);

	}

	// create a method that will check is user is older then 18
	// if it is not then we want to show an exception

	public static void checkAge(int age) {

		if (age >= 18) {
			System.out.println("you can get Ls");
		} else {
			throw new RuntimeException("You must be older than 18");

		}
	}

}
