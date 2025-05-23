package PolymorphismOLandOR;

public class MethodOverLoading {

	//method overloading
	//1. passing different amount of parameters
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
		
	}
	//2. by passing different TYPE of parameters
	public void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1, double num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		obj.add(10, 20);
		obj.add(40, 20, 60);
		obj.add(12.3, 10.5);
	}
}
