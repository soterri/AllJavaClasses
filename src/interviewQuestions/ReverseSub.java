package interviewQuestions;

public class ReverseSub {
	public static void main(String[] args) {
		
		String str1 = "john's a bitch";
		String str2 = "john's a hoe";
		
		str1 = str1+str2;
		str2 = str1.substring(0,14);
		str1 = str1.substring(14);
		

		System.out.println(str1);
		System.out.println(str2);
	}

}
