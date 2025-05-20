package SuperKeyword;

public class ProgrammingLanguage {

	String name;
	String variable;

	public ProgrammingLanguage(String name, String variable) {
		this.name = name; // used to initialize instance variables
		this.variable = variable;
	}

}

class Java extends ProgrammingLanguage {

	String constructor;

	Java(String name, String variable, String constructor) {
		super(name, variable);
		this.constructor = constructor;
		/*
		 * as soon as you create a parametized constructor inside parent class compiler
		 * will enforce you to create a parametized constructor inside child class bc
		 * explicitly you have to make a call to initialize the variables from your
		 * parent class so, in the test class, if you want to create an obj, you're
		 * enforced to pass the same amount of parameters in the constructor
		 * 
		 */
	}

	public void details() {
		System.out.println(name + " can have variables " + variable + " and constructor");
	}
}

class JavaScript extends ProgrammingLanguage {
	public JavaScript(String name, String variable) {
		super(name, variable);
		
	}

	public void details() {
		System.out.println(name + " can have variables " + variable + " and");
	}
}