package PolymorphismOLandOR;

public class BankTest {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.money=900;
		double fee = bank.chargeFee();
		System.out.println("bank fee "+fee);
		
		PNC pnc = new PNC();
		pnc.money=900;
		double pncFee=pnc.chargeFee();
		System.out.println("PNC fee= "+pncFee);
		
	}
}
//method overriding