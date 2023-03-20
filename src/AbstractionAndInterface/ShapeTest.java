package AbstractionAndInterface;

public class ShapeTest {
	public static void main(String[] args) {

		ShapeInterfaceTask shape = new Circle();
		shape.calculateArea(10);
		shape.calculatePerimeter(10);
		
		ShapeInterfaceTask shape1 = new Square();
		shape1.calculateArea(4);

	}
}