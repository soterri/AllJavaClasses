package InheritanceAndThisKW;

public class Country {

	public String capital, name;

	// Country(String countryName, String countryCapital) {
	// System.out.println("The country is " + name1 + " and the capital is " +
	// capital1);
	Country(String name, String capital){
	this.name=name;
	this.capital=capital;
	}
	Country(String name){
		//name=name; will display null bc instance variables uptop did not get initialized
	}
	

	public static void main(String[] args) {

		
		Country country1 = new Country("USA");
		country1.displayInfo();
		Country country2= new Country("Cambodia", "Phnom Penh");
		country1.name = "USA";
		country1.capital = "Washington DC";
		country1.displayInfo();

	}

	void displayInfo() {
		System.out.println("The country is " + name + " and capital is " + capital);
	}

}
