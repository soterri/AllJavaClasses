package PolymorphismOLandOR;

public class Bank {

	double money;

	public double chargeFee() {

		double fee = 0;

		if (money < 1000) {
			fee = money * 0.1;
		} else {
			fee = 0;
		}
		return fee;
	}
}

class PNC extends Bank {
	
	@Override
	public double chargeFee() {
		double fee;
		if (money < 1000) {
			fee = money * 0.6;
		} else {
			fee = 0;

		}
		return fee;
	}

}