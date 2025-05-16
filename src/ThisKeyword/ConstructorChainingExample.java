package ThisKeyword;

public class ConstructorChainingExample {
	
	public ConstructorChainingExample() {
		this(1);
		System.out.println("Hi");
	}
	public ConstructorChainingExample(int x) {
		this(1,2);
		System.out.println("hello");
	}
	public ConstructorChainingExample(int x, int y){
		System.out.println("How are you");
		
	}
	public static void main(String[] args) {
		ConstructorChainingExample obj = new ConstructorChainingExample();
	}
}
