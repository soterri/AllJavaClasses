package Exceptions;

public class InfoAboutExceptions {
	public static void main(String[] args) {
		
		String str = "Hello";
		
		try {
			char character = str.charAt(10);
			System.out.println(character);
		}catch(StringIndexOutOfBoundsException se) {
			//to get info about the exception
			se.printStackTrace(); //name, msg about E, where it occurs
			System.out.println(se); //name. msg about E
			//System.out.println(se.getMessage());
		}
		System.out.println("end of program");
		
	}

}
