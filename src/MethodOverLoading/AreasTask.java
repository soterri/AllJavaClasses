package MethodOverLoading;

public class AreasTask {

	public int area(int a, int b) {
		int area = a * b;
		System.out.println("Area of rectangle is " + area);
		return area;

	}

	public int area(int a) {
		int area = a * a;
		System.out.println("Area of Square is " + area);
		return area;
	}

	public int area(int a, int b, int c) {
		int area = a * b * c;
		System.out.println("Area of Box is "+area);
		return area;
	}
}
