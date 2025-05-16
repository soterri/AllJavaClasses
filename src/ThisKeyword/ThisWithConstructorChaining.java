package ThisKeyword;

public class ThisWithConstructorChaining {
	
	public ThisWithConstructorChaining() {
		System.out.println("non argument constructor");
	}
	ThisWithConstructorChaining(String str){
		this();
	}
	public ThisWithConstructorChaining(String str, String str1) {
		this("Hello");
	}
	public static void main(String[] args) {
		//creating an object by passing 2 string values
		ThisWithConstructorChaining obj = new ThisWithConstructorChaining("j","g");
		
	}

}
