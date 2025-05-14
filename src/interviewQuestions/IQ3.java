package interviewQuestions;

public class IQ3 {
	public static void main(String[] args) {

		/*
		 * Find out many alpha characters present in a string?
		 */

//		String str = "Hello+54545454*&^%$#^%$#545454^%^*^&";
//
//		str = str.replaceAll("[^a-zA-Z]", "");
//
//		System.out.println(str);
//		System.out.println(str.length());

		String str = "Hellofgfhfhrfrg$^&*&(";
		
		str = str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str);
		System.out.println(str.length());
	}

}
