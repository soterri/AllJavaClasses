package com.syntax.class06;

public class SwitchStatement {

	public static void main(String[] args) {

		// switch case is values based
		// it knows the values -> jump into matching case

		int day = 7;
		String name;

		switch (day) {
		case 1:
			name = "Monday";
			break;
		case 2:
			name = "Tuesday";
			break;
		case 3:
			name = "Wednesday";
			break;
		case 4:
			name = "Thursday";
			break;
		case 5:
			name = "Friday";
			break;
		case 6:
			name = "Saturday";
			break;
		case 7:
			name = "Sunday";
			break;
		default:
			name = "Invalid";
			break;
		}
		System.out.println(name);
	}

}
