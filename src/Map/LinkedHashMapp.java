package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapp {

	public static void main(String[] args) {
		
		//store students id and corresponding name
		Map<Integer, String> student = new LinkedHashMap<>();
		student.put(101, "Sotheary");
		student.put(102, "Cameron");
		student.put(103, "Savannah");
		student.put(104, "Ange");
		student.put(105, "Max");
		student.put(106, "Sophy");
		System.out.println(student);
		
		String replace = student.replace(101, "Terri");
		System.out.println(replace);
	}
}
