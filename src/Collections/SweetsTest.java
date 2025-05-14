package Collections;

import java.util.LinkedList;
import java.util.List;

public class SweetsTest {
	public static void main(String[] args) {
		//create a list of Sweet objects
		
		List<Sweets> sweets = new LinkedList<Sweets>();
		sweets.add(new Sweets ("cupcakes"));
		sweets.add(new Sweets("chocolate"));
		sweets.add(new Sweets ("pudding"));
		sweets.add(new Sweets ("cookies"));
		
		for(Sweets sw:sweets) {
			System.out.println(sw.name);
			sw.iLoveSweets();
		}
		//retrieving one element and accessing method
		//2 steps
		Sweets sweetz=sweets.get(1);
		sweetz.iLoveSweets();
		System.out.println("----------------------");
		//1 step
		sweets.get(2).iLoveSweets();
		String sweetsName = sweets.get(2).name; //name is a string
		System.out.println(sweetsName);
	}

}
//sweets is a collection object