package com.syntax.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		
		/*create a grocery list:
		 * fruits, veggies, dairy {}
		 * retrieve all values using 2 different loops
		 */
		
		String[][] groceryList = {
				
				{"apple", "mango", "bananas"},
				{"onion", "carrot","pepper"},
				{"yogurt", "milk", "cheese"}
		};
		
		for(int i=0; i<groceryList.length; i++) {
			
			for(int j=0; j<groceryList[i].length; j++) {
				System.out.print(groceryList[i][j]+" ");
			}
			System.out.println();
		}
		
		for(String[] list:groceryList) {
			
			for(String item:list) {
				
				System.out.print(item+" ");
				
			}
			System.out.println();
		}
		
	}
}
