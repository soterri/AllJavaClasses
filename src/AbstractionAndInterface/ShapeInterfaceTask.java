package AbstractionAndInterface;

import java.awt.Shape;

public interface ShapeInterfaceTask {

	/*
	 * Calculate an Interface Shape with undefined methods as calculateArea and
	 * calculatePerimeter create 2 child classes: Circle and Square that should have
	 * an implementation of area and perimeters calculation. test your code
	 * 
	 */

	void calculateArea(double num);

	void calculatePerimeter(double num);
}

class Circle implements ShapeInterfaceTask {

	@Override
	public void calculateArea(double num) {
		System.out.println(3.14 * (num * num));

	}

	@Override
	public void calculatePerimeter(double num) {
		System.out.println((3.14 * 2) + (num));

	}

}

class Square implements ShapeInterfaceTask {

	@Override
	public void calculateArea(double num) {
		System.out.println(num * num);
	}

	@Override
	public void calculatePerimeter(double num) {
		System.out.println(num * 4);

	}
}
	
