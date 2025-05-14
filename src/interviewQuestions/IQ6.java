package interviewQuestions;

public class IQ6 {

	/*
	 * Write a java program to find whether a String is palindrome or not?
	 * if reversed string and originial are same - string is palindrome
	 * madam, racecar, kayak
	 * Step1: reverse the string
	 * Step2: compare 2 String
	 */
	
	public static void main(String[] args) {
		
		String palindrome = "kayaK";
		String reversed = "";
		
		for(int i=palindrome.length()-1; i>=0; i--) {
			reversed = reversed + palindrome.charAt(i);
		}
		System.out.println(reversed);
		
		if(palindrome.equalsIgnoreCase(reversed)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}
}

