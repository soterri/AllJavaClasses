package com.syntax.class06;

import java.util.Scanner;

public class SaleTask {
	public static void main(String[] args) {

		/*
		 * ask user to enter boolean value for sale if no sale - I am not shopping if
		 * sale - check price of item based on amt - we will have to calculate the price
		 * after discount if price - 20 - apply 10% if price bw 20-100 - 20% if price bw
		 * 100-500 - 30% anything else - 50% after discount - price o the item ruduce
		 * from __ to __
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Is there a sale going on?");
		boolean sale = scan.nextBoolean();

		double price;
		double discount;
		double finalPrice;

		if (!sale) {
			System.out.println("I am not going shopping, I'm broke asf");
		} else {

			System.out.println("What is the sale of the item without the sale");
			price = scan.nextDouble();

			if (price < 20) {
				discount = price * 0.10;
				finalPrice = price - discount;
			} else if (price >= 20 && price < 100) {
				discount = price * 0.20;
				finalPrice = price - discount;
			} else if (price >= 100 && price < 500) {
				discount = price * 0.30;
				finalPrice = price - discount;

			} else {
				discount = price * 0.50;
				finalPrice = price - discount;

			}
			System.out.println("After discount the item costs "+discount+" the price of the item is reduced from "+price+ " to "+finalPrice);

		}
	}

}
