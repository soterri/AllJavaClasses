package MethodOverriding;

public class CardTest {

	public static void main(String[] args) {
		//int i=20; //primitive
		String str = "Hello"; //non primitives
		
		//take an object of the child class and give reference to the parent
		     //reference variable = object is created   
		Card card = new AX(); //CARD is a type - class - like int, string is a type the variable card is of class CARD
		card.creditLimit();//child class
		card.chargeInterest();//from parent class
		
		Card mc = new MC();//creating an obj of MC and assigning to variable mc
		mc.chargeInterest();
		mc.creditLimit();
		
		Card visa = new Visa();
		visa.creditLimit();
		visa.chargeInterest();
		
		
		System.out.println("****************");
		// first created objects and assigned to the variables and the 
		//stored those variables inside the array
		
		//specify type, identify array, give array variable name
		//type [] arrayName = {};
		
		//this array will hold non primitive type of Card types
		//Card[] cardArray = {card, mc, visa};
		Card[] cardArray1 = {new MC(), new AX(), new Visa(), new Discovery()};
		
		//cardArray[0]; referring to MC
			
			for(Card cc:cardArray1) {
				cc.creditLimit();
				cc.chargeInterest();
		}
			
			for(int i=0; i<cardArray1.length; i++) {
				cardArray1[i].chargeInterest();
				cardArray1[i].creditLimit();
				
			}
			System.out.println("--------------");
			MC mc1 = new MC();
			mc1.cashBack();
			mc1.chargeInterest();
			mc1.creditLimit();
			

			MC mc2 = new MC();
			mc1.cashBack();
			mc1.chargeInterest();
			mc1.creditLimit();
			
			
			System.out.println("---Creating an array that will hold only MC types----");
			MC[] masterCards = {mc1,mc2};
			
			for(MC mCard:masterCards) {
				mCard.cashBack();
				mCard.creditLimit();
				mCard.chargeInterest();
				
			}
		
	}
}


/*runtime polymorphism is achieved through method overriding 
create obj of child class and give reference to parent class
now thru the reference variable we are accessing methods that are applicable only for referring type
during runtime jvm will search for runtime obj and based on obj specific methods will get executed.*/