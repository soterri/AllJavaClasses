package MethodOverLoading;

public class Addition {

	// method overloading is changing the number or type of parameters
	void add(int num, int num1) {
		System.out.println(num + num1);
	}

	void add(int num, int num1, int num2) {
		System.out.println(num + num1 + num2);
	}

	void add(int num, double num1) {
		System.out.println(num + num1);
	}

	void add(double num, double num2) {
		System.out.println(num + num2);
	}

}
