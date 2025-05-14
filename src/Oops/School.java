package Oops;

public class School {

	String name, address, website;
	int students;

	void study() {
		System.out.println("Students study at " + name);
	}

	void teach() {
		System.out.println("Teachers teaching at " + name);
	}

	public static void main(String[] args) {

		School school = new School();
		school.name = "Harvard";
		school.students = 20000;
		school.study();
		school.teach();

		School school1 = new School();
		school1.name = "Jeb Stuart";
		school1.students = 40000;
		school1.study();
		school1.teach();

	}
}
