package ThisKeyword;

public class ThisKeyword {

	int a;
	int b;

	public ThisKeyword() {
		System.out.println("non argument constructor");
	}
	public ThisKeyword(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void sum(int a, int b) {
		System.out.println("Sum of local variables " +(a + b));
		//sum of which variables are being calculated? local variables within this method
		System.out.println("Sum of INSTANCE variables "+ (this.a+this.b));
	}

	
	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword(10,25);
		obj.sum(10, 20);
		
		System.out.println("------------------");
		ThisKeyword obj2 = new ThisKeyword();
		obj2.sum(20, 40);
		obj2.sum(80, 150);
		
		ThisKeyword obj3 = new ThisKeyword(50,70);
		obj3.sum(50, 150);
		
	}
}
