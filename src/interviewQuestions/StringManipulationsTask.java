package interviewQuestions;

import java.util.Scanner;

public class StringManipulationsTask {
	public static void main(String[] args) {

		// ask user to enter browser
		// based on input - say your selected browser is _____

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter browser name");
		String browser = scan.nextLine();

		switch (browser.toLowerCase()) {

		case "chrome":
			System.out.println("Execution to be performed on " + browser);
			break;
		case "firefox":
			System.out.println("Execution to be performed on " + browser);
			break;
		case "safari":
			System.out.println("Execution to be performed on " + browser);
			break;
		case "microsoft edge":
			System.out.println("Execution to be performed on " + browser);
			break;
		default:
			System.out.println("Please enter valid browser");
		}
	}

}
