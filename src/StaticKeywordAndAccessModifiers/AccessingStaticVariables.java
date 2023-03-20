package StaticKeywordAndAccessModifiers;

public class AccessingStaticVariables {

	public static void main(String[] args) {
		
		Husky obj = new Husky();
		//System.out.println(obj.name); will print out null bc you have to assign a value
		String name=obj.name="Terri";
		System.out.println(name);
		
		System.out.println(Husky.breed);
		System.out.println(obj.breed); //not preferable
		
		
		

	}

}
