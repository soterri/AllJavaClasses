package MethodOverriding;

public class Card {
	/*
	 * define a class card with 2 methods and this class should have 4 subclasses in
	 * which some behavior can be overridden and some can implement its own behavior
	 */

	public void chargeInterest() {
		System.out.println("Card charges 25% interest");
	}

	public void creditLimit() {// this method will be overridden
		System.out.println("Credit limit of the card is 5000");
	}
}

class AX extends Card {
	@Override
	public void creditLimit() {// overriding method
		System.out.println("Credit limit of the AX card is 25k");
	}
}

class MC extends Card {
	@Override
	public void creditLimit() {// overriding method
		System.out.println("Credit limit of the MC card is 15k");
	}

	public void cashBack() {
		System.out.println("Cash back will be 3%");
	}
}

class Visa extends Card {
	@Override
	public void creditLimit() {// overriding method
		System.out.println("Credut limit of the Visa card is 21000k");
	}

}
class Discovery extends Card{
	public void applePay() {
		System.out.println("Discovery can take applyPay");
	}
}
