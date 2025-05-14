package ExceptionsII;

public class FinallyBlock {
	
	public static void main(String[] args) {
		
		String str = "Hello";
		
		try {
		char charCh = str.charAt(5);
		//char charCharacter = str.charAt(5); //new StringIndexOutOfBoundsException
		System.out.println(charCh);
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}finally {
			System.out.println("I AM A FINALLY BLOCK");
			
		}
		System.out.println("End of code");
	}

}
