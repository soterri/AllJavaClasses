package Encapsulation;

import AbstractionAndInterface.Account;

public class AccountTest {
	public static void main(String[] args) {
		
		//will have to call own methods and then will get access to the private variables/methods
		Account acc = new Account();
		
		acc.setAccountNumber(234567891);
		long accNum=acc.getAccountNumber();
		System.out.println(accNum);
		
		acc.setBalance(1455);
		double myBalance = acc.getBalance();
		System.out.println(myBalance);
		
		int num=123;
		String.valueOf(num); //converts given value to String
	}
	}

		
		
		
		
		


