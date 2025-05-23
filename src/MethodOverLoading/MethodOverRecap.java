package MethodOverLoading;

public class MethodOverRecap {

	public void hello() {
		System.out.println("hello");
	}

	public void hello(String name) {
		System.out.println("hello " + name);
	}
	// overloading is not possible by changing the access modifier
	// private void hello(String str) {
	// System.out.println(str);
	//no restrictions to access modifiers, only java looks for method signature

	// CE: overloading is not possible by changing return type
	//public String hello(String name) {
		//return name;
	// method signature is what java looks for
}
