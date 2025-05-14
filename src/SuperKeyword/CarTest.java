package SuperKeyword;

public class CarTest {

	public static void main(String[] args) {
		
		//creating an obj of child class
		//Tesla tesla = new Tesla();
		Tesla tesla1 = new Tesla("Honda", "Accord",true);
		tesla1.displayInfo();
		Tesla tes2 = new Tesla("Mercedes", "Benz",  false);
		tes2.displayInfo();
		
	}
}
