package VariablesAndAccessModifiers;

public class InstanceVariables {
	
	String name = "Terri";
	String name1 = "Sophy";
	
	public static void main(String[] args) {
		
		String name = "Savannah";
		System.out.println(name);
		
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name);//instance variable
		//System.out.println(names);
		//OR print instance variable by: sysout(obj.name);
		//changing value of the instance variable
		obj.name="Cameron";
		System.out.println(obj.name);//local variable
		
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name1);//instance variable
		
	}

}
