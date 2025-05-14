package interviewQuestions;

public class StringManipulations {
	public static void main(String[] args) {
		
		//string class comes from the java library, from the jdk 
		String str = "hello"; // literal string
		
		String str1 = new String("Hello"); //using new keyword - create a string object
		
		System.out.println(str);
		System.out.println(str1);
		
		//find the numbers of characters inside the string
		int length = str.length();
		System.out.println(length);
		
		//case conversion/methods
		String upper=str.toUpperCase();
		System.out.println(upper);
		
//		//method chaining
//		str.toLowerCase().toUpperCase();
//		System.out.println(str);

		String lower = str.toLowerCase();
		System.out.println(lower);
		
		//verify if the string is empty
		String myString = "";
		boolean empty=myString.isEmpty();
		System.out.println(empty);
		
		//how to verify existence of characters in the string
		System.out.println("------------------------");
		String a = "Good morning students";
		boolean exist=a.contains("students");
		System.out.println(exist);
		
		System.out.println(a.startsWith("good"));
		System.out.println(a.endsWith("morning"));
		
		//String myString1 = null;//no value at all not even empty value
		//System.out.println(myString1.isEmpty());
		
	}

}
