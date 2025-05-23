package MethodOverriding;

import PolymorphismOLandOR.MethodOverLoading;

public class Examples {

	public String MethodOverloading(String str) {
		// System.out.println("method OVERLOADING");
		return str;
	}

	public String MethodOverloading(String str, String str2) {
		return str + " " + str2;
	}
}

class smallExample extends Examples {
	public String MethodOverloading(String str) {
		return "Hello " + str;

	}


}

