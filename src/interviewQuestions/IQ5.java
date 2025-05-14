package interviewQuestions;

public class IQ5 {
	
	public static void main(String[] args) {
		
		/*Write a java program to reverse String?
		 * Reverse a string word by word?
		 * 
		 * to reverse string
		 * split();
		 * Step 1: split -> array of String
		 * Step 2: use for loop and use decrement to print values
		 */

		//type String with variable name given holding the sentence "Welcome to java class"
		String given = "Welcome to java class";
		
		//creates a string variable named reverse initialized as an empty string which will later hold the reversed sentence
		String reverse = "";
		
		//splits the original sentence into words using space as the seperator
		String[] str = given.split("\\s"); //means split whereever theres a whitespace, str is now an array of strings
		
		//for loop iterates in reverse order and concatenates each word into reverse
		for(int i=str.length-1; i>=0; i--) {
			reverse = reverse + str[i]+" ";//reverse is the string youre building to contain the reversed sentence
			//+= to add onto existing string
			//str[i] gets the word at position i in the array
		}
		System.out.println(reverse); //prints the reversed string
		
		//write a java program to reverse string?
		//using toCharArray(); charAt();
		
		String rev="Today is Java Class";
		char[] charArray = rev.toCharArray();
		
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		System.out.println("----charAt---");
		String rev1 = "Today is Java Class";
		for(int i=rev1.length()-1; i>=0; i--) {
			System.out.print(rev1.charAt(i));
		}
		
		
		
		
	}

}

/*To manipulate String we have different calsses
 * 1. String class
 * 2. Stringbuffer class
 * 3. Stringbuilder class
 */
