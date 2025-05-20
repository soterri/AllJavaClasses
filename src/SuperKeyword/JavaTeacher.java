package SuperKeyword;

public class JavaTeacher extends Teacher{

	// compiler will try to create a default constructor and make a call
	// inside the parent class constructor
	// JavaTeacher();
	// super();

	String certifications;

	JavaTeacher(String name, String lastName, String certifications) {
		super(name, lastName);
		this.certifications = certifications;
	}

	JavaTeacher(String name, String lastName) {
		super(name, lastName);
	}
}
