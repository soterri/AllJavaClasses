package StaticKeywordAndAccessModifiers;

public class TestAccessModifiers {
	public static void main(String[] args) {
		
		AccessModifiers.hello();
		AccessModifiers.hello1();
		AccessModifiers.hello2();
		System.out.println(AccessModifiers.language);
		
		AccessModifiers obj = new AccessModifiers();
		System.out.println(obj.name);
	}

}
