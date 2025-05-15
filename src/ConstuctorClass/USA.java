package ConstuctorClass;

public class USA {

	// create variables to hold state and capital
	String state, stateCapital;

	// create a method to display state and state capital
	public void displayInfo() {
		System.out.println(state + " and it's capital is " + stateCapital);
	}

//	public USA(String stateName, String stateCap){
//		state=stateName;
//		stateCapital=stateCap;
	public USA(String state, String stateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;
		// this refers to the current instance/obj - used to differentiate between local
		// and instance variables
//		when creating the obj take the value of VA and assign
//		the value of VA to the current obj state same for capital
//		using the value, you will initialize the current obj instance variable

	}

	public static void main(String[] args) {
		USA obj = new USA("Virginia", "Richmond");
		USA obj1 = new USA("New York", "New York City");
		obj.displayInfo();
		obj1.displayInfo();
	}

}
