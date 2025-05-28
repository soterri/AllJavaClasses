package MethodOverriding;

public class FinalKeyword {
	public static void main(String[] args) {
		
		
		String str ="Hello";
		str = "I am cool";
		System.out.println(str);
		
		final String finalString = "Java is not easy";
		//finalString = "Java is hard"; string is not modifiable b/c its final
	}
		public final void hello() {
			System.out.println("final method in parent class");
		}
		
	}
class FinalKeywordChild extends FinalKeyword{
	//final methods cannot be overridden, we will get CE
	//public final void hello() {
		//System.out.println("final method in child class cannot be overridden");
	//}
}

/*final keyword = non access modifier that identifies the variable, method, class is completed
 * and cannot be further modified
 *
 * final can be used with 
 * 1. variables -> constant values, final variables must be initialized
 * 2. methods -> final methods can't be overridden, but can be overloaded
 * 3. classes -> final classes can't have subclasses
 */
 