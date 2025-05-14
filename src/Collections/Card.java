package Collections;

public abstract class Card {

	String cardType;

	Card(String cardType) {
		this.cardType = cardType;

	}

	public abstract void creditLimit();

	public void cashBack() {
		System.out.println(cardType + " gives us cash back of 3%");
	}

}
class Visa extends Card{
	Visa(String cardType){
		super(cardType);
	}

	@Override
	public void creditLimit() {
		System.out.println("Credit limit of the "+cardType+ "is $2500.00");
		
	}
}
class AX extends Card{

	AX(String cardType) {
		super(cardType);
		
	}

	@Override
	public void creditLimit() {
		System.out.println("Credit limit of the "+cardType+" is $2000");
		
	}
	
}
class Master extends Card{

	Master(String cardType) {
		super(cardType);
		
	}

	@Override
	public void creditLimit() {
		System.out.println("Credit limit of the "+cardType+" is $28000");
		
	}
	
}