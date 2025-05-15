package StaticKeywordAndAccessModifiers;

public class SixTask {

	/*
	 * create a method that will accept an array of integers as parameters and will return a sum
	 * of elements from that array. Method should be visible only within the same
	 * package and accessible by creating an instance of the class
	 */

	protected int sumAll(int[] array) {

		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}

	//create a method that will take string as a parameter and returns
	//reversed string. Method should be available to all classes within
	//your project and accessible by class name
	public static String getReverse(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
	
	/*create a method that will accept a string as a parameter and return
	 * a new string that consists of vowels. method should be available inside the 
	 * class where it was declared and executed by calling its name
	 */
	
	private static String getVowels(String str) {
		String vowels;
		vowels = str.replaceAll("[^aeiouAEIOU]", "");
		return vowels;
		
		
		
	}

	public static void main(String[] args) {

		SixTask obj = new SixTask();
		int[] array = { 85, 858, 5 };
		System.out.println("total: " + obj.sumAll(array));
		// this array variable is local to the main method and it's visibility stays
		// within the main method
		
		String str = SixTask.getReverse("johns a bitch");
		System.out.println(str);
		
		String vowels=getVowels("Hello");
		System.out.println(vowels);
		
		

	}

}
