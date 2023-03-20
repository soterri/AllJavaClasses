package CollectionsII;

import java.util.*;

public interface HashSetDemoSweets {
	public static void main(String[] args) {
		
		//create a collection that will store sweets type of object
		//and i do not care about the order as long as I do not have duplicate objects
		
		HashSet<Sweets> sweetSet = new HashSet<>();
		
		Sweets sweet = new Sweets("Cake");
		sweetSet.add(sweet);
		sweetSet.add(new Sweets("Ice cream"));
		sweetSet.add(new Sweets("Boba tea"));
		sweetSet.add(new Sweets("Chocolate cake"));
		sweetSet.add(new Sweets("Boba tea"));
		sweetSet.add(new Sweets("Cupcakes"));
		
		System.out.println(sweetSet.size());
		
//		for(Sweets element:sweetSet) {
//			System.out.println(element.name);
		
		for(Sweets element: sweetSet) {
			System.out.println(element.name);
		}
		System.out.println("--------------");
		
		Iterator<Sweets> it = sweetSet.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next().name);
		}
	}
	
	

}
