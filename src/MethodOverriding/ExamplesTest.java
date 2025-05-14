package MethodOverriding;

public class ExamplesTest {

	
	public static void main(String[] args) {
		
			Examples obj = new Examples();
			String str=obj.MethodOverloading("Hello");
			System.out.println(str);
			String str1 = obj.MethodOverloading("Hi", "Bye");
			System.out.println(str1);
		
	}
}
