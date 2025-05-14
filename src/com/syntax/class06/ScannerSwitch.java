package com.syntax.class06;

import java.util.Scanner;

public class ScannerSwitch {
	
	public static void main(String[] args) {
		/* ask user where are they from
		 * based on the country specify fav food
		 */

		
		String country, foodName;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine(); 
		
		switch(country) {
		case "Cambodia": 
			foodName="Salaw machu kreung";
			break;
		
		case "Vietnam":
			foodName="pho";
			break;
			
		case "El Salvador":
			foodName="pupusas";
			break;
			
		case "Kazakhstan":
			foodName="Kumis";
			break;
			
		case "Thailand":
				foodName="pad thai";
				break;
		
		default:
			foodName="unk";
		}
		System.out.println("You are from " +country+ " and your favorite food is " +foodName);
		
		
		
		
	}

}


