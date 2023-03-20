package CollectionsII;

import java.util.LinkedList;
import java.util.List;

public class SweetsTest {
	public static void main(String[] args) {
		
		List<Sweets> sweetList = new LinkedList<>();
		sweetList.add(new Sweets("candy"));
		sweetList.add(new Sweets("cake"));
		sweetList.add(new Sweets("cupcakes"));
		
		//display name of each sweet object
		
		for(Sweets element:sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		
		//retrieving 1 element and accessing method - 2 steps
		Sweets mySweet=sweetList.get(2);
		mySweet.iLove();
		
		//retrieving element and accessing method 1 step
		sweetList.get(2).iLove();
		
		String str = "Hello 123";
		String ele=str.replace("123", "456").trim();
		System.out.println(ele);
		
		Integer num=100;
					//int 100 converts to "100" -> "200" ---- 3
		int newNumber = num.toString().replace("100", "200").length();
		System.out.println(newNumber);
	}

}
