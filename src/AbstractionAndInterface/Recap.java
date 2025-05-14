package AbstractionAndInterface;

public class Recap {

	public static void main(String[] args) {

		// to store single value
		int num = 10;

		// to store multiple values
		int[] array = { 10, 20, 30 };

		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2]=300;

		System.out.println(arr[2]);

		// to retrieve 1 by 1
		// using enhanced loop
		// RIGHT SIDE - array name LEFT SIDE type of element and any variable name
		for (int num1 : arr) {
			System.out.println(num1);
		}

		// using for loop
		System.out.println("Using for loop");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Fruit f = new Apple();
		Fruit f1 = new Banana();
		Fruit f2= new Orange();
		Object f3 = new Orange();
		
		
		Fruit[] fruitArray = {f,f1,f2};
		for(Fruit fr:fruitArray) {
			
		}
		Object[] frArr = {f,f1,f2};
		for(Object fru:frArr) {
			
		}
	}
}

	// we can store non primitive types: objects
class Fruit  {
		
	

	}

	class Apple extends Fruit {

	}

	class Orange extends Fruit {

	}

	class Banana extends Fruit {

	}
