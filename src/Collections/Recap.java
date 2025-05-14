package Collections;

public class Recap {

	public static void main(String[] args) {

		// to store a single variable
		int num = 10;

		// to store multiple values
		int[] array = { 10, 20, 30 };

		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		System.out.println(arr[2]);

		// to retrieve values 1 by 1

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		// enhanced loop
		for (int a : arr) {
			System.out.println(a);

		}
		// to store non primitive types: objects
		Fruit f = new Apple(); // variable f is a non primitive type of fruit
		Fruit f1 = new Orange();
		Fruit f2 = new Banana();
		Object monkey = new Monkey();

		Object[] mixArray = { f, f1, f2, monkey, "Hello"};//f is referring to the object of apple and so on

		for (Object f3 : mixArray) {
			System.out.println(f3);
		}
	}
}

class Monkey extends Object {

}

class Fruit extends Object {

}

class Apple extends Fruit {

}

class Orange extends Fruit {

}

class Banana extends Fruit {

}