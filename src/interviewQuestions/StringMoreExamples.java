package interviewQuestions;

public class StringMoreExamples {
	public static void main(String[] args) {
		
		//get a character at specific location USE charAt()!
		
		String str = "Syntax Technologies Inc";
		
		char letter = str.charAt(5);
		System.out.println(letter);
		
		//System.out.println(str.charAt(str.length())); will get a StringIndexOutOfBoundsException
		System.out.println(str.charAt(str.length()-1));
		
		//get a substring from a String 
		//get SYNTAX
		String getWord=str.substring(0, 6);
		System.out.println(getWord);
		
		//get Technologies Inc
		String getWord1 = str.substring(7);
		System.out.println(getWord1);
		
	}

}
