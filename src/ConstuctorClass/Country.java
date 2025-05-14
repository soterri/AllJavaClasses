package ConstuctorClass;

public class Country {

	// logic, specifying members of the class
	public String name, capital;
	int population;

	Country() {
		System.out.println("NON ARGUMENT CONSTRUCTOR");
	}

	Country(String name, String capital, int population) {
		this.name = name; // assigning to the variable, initialization of instance variable
		this.capital = capital;
		this.population = population;
	}

	void displayInfo() {
		System.out.println("The country name " + name + " and the country capital is " + capital+" and population is "+population);
	}

	public static void main(String[] args) {
		// inside the main method, we test the logic we wrote
		Country c1 = new Country("USA", "DC", 10000);
		Country c2 = new Country("Cambodia", "Phnom Penh",15050);
		//Country c3 = new Country();

		System.out.println(c1.name + " " + c1.capital);
		System.out.println(c2.name + " " + c2.capital);
		//System.out.println(c3.name);

		c1.displayInfo();
	}

}