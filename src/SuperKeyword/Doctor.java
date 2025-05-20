package SuperKeyword;

public class Doctor {

	int doctorId;
	String name;

	public Doctor(int doctorId, String name) {
		this.doctorId = doctorId;
		this.name = name;

	}
}

class Dentist extends Doctor {
	String teeth;

	public Dentist(int doctorId, String name, String teeth) {
		super(doctorId, name);
		this.teeth = teeth;

	}

	public void display() {
		System.out.println("Doc ID " + doctorId + " and " + name);
	}

	

	public static void main(String[] args) {
		Dentist doc = new Dentist(123, "John", "yes to clean");
		doc.display();
	}

}
