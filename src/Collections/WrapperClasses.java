package Collections;

public class WrapperClasses {	
	public static void main(String[] args) {
		
		int num = 10;
		
		//Autoboxing - converting primitive type into an object type
		Integer integer=100; 
		System.out.println(integer.MIN_VALUE);
		
		String str =integer.toString();
		System.out.println(str);
		
		//converting boolean primitive type into boolean object
		Boolean bool = true;
		
		Byte b=20;
		System.out.println(b.MAX_VALUE);
		
		//AutoUNBOXING - converting object type into primitive type
		int num1 = new Integer(10);
		System.out.println(num1);
		
		//Why do we need wrapper classes? to convert primitives into non primitives
		//we
		
	}

}
