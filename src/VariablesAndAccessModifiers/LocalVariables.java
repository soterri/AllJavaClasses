package VariablesAndAccessModifiers;

public class LocalVariables {
	
	public static void main(String[] args) {
		
		LocalVariables obj = new LocalVariables();
		obj.sayName();
		//System.out.println(myName); scope is only within sayName method
		String emails=obj.createEmail("Terri", "Thach", "outlook");
		System.out.println(emails);
		//System.out.println(userEmail); variables live within their own methods. The scope is only within that method.
		
	}
	
	void sayName() {
		
		String myName = "Terri";
		System.out.println(myName);
		//System.out.println(obj); wont be accessible, scope is only within the main method
		
		
	}
	
	String createEmail(String name, String lastName, String email) {
		
		String userEmail=name+lastName+"@"+email+".com";
		return userEmail;
		
	}
	
}
