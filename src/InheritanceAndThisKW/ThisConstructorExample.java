package InheritanceAndThisKW;

public class ThisConstructorExample {
	
	public ThisConstructorExample() {
		this(1); //calls constructor with 1 parameter
		System.out.println("Hi");
	}
	ThisConstructorExample(int x){
		this(1,2);//calls constructor with 2 parameters
		System.out.println("Hello");
	}
	ThisConstructorExample(int x, int y){
		System.out.println("How are you");
	}
	
	public static void main(String[] args) {
		ThisConstructorExample obj = new ThisConstructorExample();
	}

}

//steps
/*line 18 - finds the matching constructor with no parameters line 5
 * then compiler sees THIS(1) will look for line 10 this(1,2) 
 * calling constructor with 2 parameters and will execute how are you first
 * then will go back to execute hello and then hi 
 */
