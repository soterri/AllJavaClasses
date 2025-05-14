package interviewQuestions;

public class StringMethods {
	
	public static void main(String[] args) {
		//replace
		String str = "Java classes at Syntax are awesome";
		
		str=str.replace("awesome", "great");
	
		System.out.println(str);
		
		str=str.replace("a", "a##%$^%^545454a");
		System.out.println(str);
		System.out.println("****************");
		
		//replaceAll -> specify regular expression
		
		//lets remove all special characters
		
		str=str.replaceAll("[^A-Za-z]", "");	
		System.out.println(str+" ");
		
		//split
		String myString = "Java classes at Syntax are awesome";
		String[] array = myString.split("a");
		System.out.println(array.length);
	
		
		
		
	}

}
