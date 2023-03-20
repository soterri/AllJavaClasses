package StaticKeywordAndAccessModifiers;

public class TestStaticVsNonStatic {

	public static void main(String[] args) {
		
		/*how to access static members
		 * can be accessed by class name where theyre defined
		 */
		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getInfo1();
		
		/*how to access non static members
		 * can be accessed by creating an object
		 * of the class
		 */
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.name="Terri";
		obj.grade='A';
		obj.getInfo();
		obj.getInfo1();
		
	}
}
