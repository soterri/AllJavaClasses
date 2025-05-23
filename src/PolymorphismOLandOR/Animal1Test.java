package PolymorphismOLandOR;

public class Animal1Test {

	public static void main(String[] args) {
	
		Animal1 animal = new Monkey();
		animal.whoAmI();
		
		Animal1 ani = new Animal1();
		ani.whoAmI();
		}
	}
