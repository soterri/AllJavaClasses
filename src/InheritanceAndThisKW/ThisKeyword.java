package InheritanceAndThisKW;

public class ThisKeyword {
	
	int a, b;
	
	public ThisKeyword(int a, int b) {
		this.a=a;
		this.b=b;
		
	}
	public ThisKeyword() {
		System.out.println("I am a non argument constructor");
	}
	
	public void sum(int a, int b) {
		System.out.println("The sum of the local parameters is "+(a+b));
		System.out.println("The sum of instance variables is "+(this.a+this.b));
	}
	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword(5,10);
		obj.sum(10, 20);
		
		ThisKeyword obj1 = new ThisKeyword();
		obj1.sum(100, 200);
				
	}

}
