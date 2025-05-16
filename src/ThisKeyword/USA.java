package ThisKeyword;

public class USA {

	String state, stateCapital;

	public USA(String state, String stateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;
	}

	public void displayInfo() { // can I call a method inside another method? YES
		//this.displayState(); by default compiler adds this kw to a method so we dont have to add it.
		displayState();
		displayCapital();
		System.out.println("The state is: " + state + " and the capital is: " + stateCapital);
	}
	public void displayState() {
		System.out.println(state);
	}
	public void displayCapital() {
		System.out.println(stateCapital);
	}

	public static void main(String[] args) {
		USA obj = new USA("Virginia", "Richmond");
		obj.displayInfo();
		obj.displayState();
	}
}
