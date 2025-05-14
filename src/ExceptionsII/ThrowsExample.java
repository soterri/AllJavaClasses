package ExceptionsII;

public class ThrowsExample {

	static String name = "Ryan";

	public static void main(String[] args) {

		callingMore();
	}

	public static void studentSleeping() throws InterruptedException {
		System.out.println("Student " + name + " is sleeping");
		Thread.sleep(3000);
	}

	public static void callingSleepingStudent() throws InterruptedException {
		studentSleeping();

	}

	public static void callingMore() {
		try {
			callingSleepingStudent();
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}

	}

}