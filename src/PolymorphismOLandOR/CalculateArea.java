package PolymorphismOLandOR;

public class CalculateArea {

	public void area(int a, int b) {
		System.out.println("Area of a rectangle is " + (a * b));
	}

	public void area(int a) {
		System.out.println("Area of a sq is " + (a * a));
	}

	public void area(int a, int b, int c) {
		System.out.println("Area of a box is " + (a * b * c));
	}
	public static void main(String[] args) {
		
		CalculateArea area = new CalculateArea();
		area.area(10,20);
		area.area(10);
		area.area(10, 15, 20);
	}
}
