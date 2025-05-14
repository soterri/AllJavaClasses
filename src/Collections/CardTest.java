package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class CardTest {
	
	public static void main(String[] args) {
		
		List<Card> ccList = new LinkedList<>();
		Card card = new AX("Amex");
		Master mc = new Master("Master Card");
		ccList.add(new AX("Amex"));
		ccList.add(new Visa("Visa"));
		ccList.add(new Master("Master"));
		ccList.add(card);
		
		//call both methods of each element
		Iterator<Card> it = ccList.iterator();
		while(it.hasNext()) {
//			it.next().cashBack();
//			it.next().creditLimit();
			
			Card cc = it.next();//stepped into next element, grabbed thast element an stored it inside variable, using the variable that refers to the objects, we have access to calling the methods cashBack, then goes into next element 
			cc.cashBack();
			cc.creditLimit();
		}
	}

}
