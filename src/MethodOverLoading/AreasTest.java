package MethodOverLoading;

public class AreasTest {
public static void main(String[] args) {
	
	AreasTask obj = new AreasTask();
	obj.area(10);
	obj.area(10, 20);
	obj.area(100, 200, 300);
}
}
