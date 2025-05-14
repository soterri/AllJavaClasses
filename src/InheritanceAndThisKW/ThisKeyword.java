package InheritanceAndThisKW;

public class ThisKeyword {

	int a, b;

	public ThisKeyword(int a, int b) {

		this.a = a;
		this.b = b;

	}
	
	public void sayA() {
		System.out.println(a);
	}
	public void sayB() {
		System.out.println(b);
	}
	public void sayAandB() {
		this.sayA();
		sayB(); //compiler adds automatically --> this.sayB();
		
	}
	public void sum(int a, int b) {
		System.out.println("The sum of local parameters is "+(a+b));
		System.out.println("The sum of instance variables is "+(this.a+this.b));
	}
	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword(5, 10);
		obj.sum(10, 20);
		
		ThisKeyword obj2 = new ThisKeyword(500, 40);
		obj2.sum(40, 10);
		obj.sayA();
		obj.sayAandB();
		obj.sayB();
	}
	

}
