package com.syntax.class05;

public class NestedIfRecap {
	public static void main(String[] args) {
		
		/*Verify if button is displayed on the page
		 * if button is displayed then we need to verify text on page
		 * if text is equal to SIGN IN -> test case passes
		 * otherwise -> wrong text is displayed
		 * 
		 */

		boolean isDisplayed = true;
		String buttonText = "Sign In";

		if (isDisplayed) {
			System.out.println("button is displayed");

			if (buttonText.equals("Sign In")) {
				System.out.println("Test case pass");
			} else {
				System.out.println("Wrong text is displayed");
			}
		} else {
			System.out.println("button is not displayed");
		}

	}

}