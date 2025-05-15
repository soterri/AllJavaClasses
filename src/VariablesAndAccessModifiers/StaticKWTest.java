package VariablesAndAccessModifiers;

public class StaticKWTest {

	public static void main(String[] args) {
		
		//access static members of another class
		StaticKeyword.brand="Android";
		StaticKeyword.touchScreen=true;
		StaticKeyword.displayGenInfo();
		
		//access instance members of another class
		StaticKeyword sk = new StaticKeyword();
		sk.color="Red";
		sk.memory=128;
		sk.displaySpecifications();
		
		StaticKeyword sk1 = new StaticKeyword();
		sk1.color="Blue";
		sk1.memory=128;
		sk1.brand="Nokia"; //brand will change for all instances
		
		//not the right way to access static methods
		sk1.displaySpecifications();
		sk1.displayGenInfo();
		sk.displayGenInfo();
		
		
	}
}
