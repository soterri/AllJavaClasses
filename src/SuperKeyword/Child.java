package SuperKeyword;

public class Child extends Parent {
	
		String name = "Cameron";

	public static void main(String[] args) {
		Child obj = new Child();
		//obj.callName();
		obj.callingMethod();
	}


	public void callName() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(super.lastName);
	}
	public void callingMethod(){
		callName();//by default this is added. calls current class
		super.callName();
	}
	
}


