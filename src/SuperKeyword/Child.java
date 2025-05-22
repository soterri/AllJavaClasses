package SuperKeyword;

public class Child extends Parent {
	
		String name = "Cameron";

	public static void main(String[] args) {
		Child obj = new Child();
		//obj.callName();
		obj.callingMethod();
		obj.hello();
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
	public void hello() {
		this.callingMethod();//implicitly compiler adds this
		super.hello();//implicitly compiler adds super
		
	}
	
}


