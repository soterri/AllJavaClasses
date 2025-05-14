package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.Iterator;

public class EmployeeMap {
	/*
	 * create a map that will store employee name and salary
	 * write a logic to retrieve an employee who gets the highest
	 * salary.
	 * output should be in the format "John Smith = $1000000"
	 */
	
	public static void main(String[] args) {
		
		Map<String, Double> empMap = new HashMap<>();
		empMap.put("Terri", 1000000.00);
		empMap.put("Sophy", 1005054.00);
		empMap.put("Ange", 545852.50);
		empMap.put("Max", 155895.00);
		
		Set<String> empSet = empMap.keySet();
		
		String maxEmp_name="";
		String emp_Name;
		
		double max_Salary = 0;
		double salary = 0;
		
		Iterator<String> it = empSet.iterator();
		
		while(it.hasNext()) {
			emp_Name=it.next();
			salary = empMap.get(emp_Name);
			
			if(salary>max_Salary) {
				max_Salary=salary;
				maxEmp_name=emp_Name;
			}
		}
		System.out.println(maxEmp_name+"="+max_Salary);
	}

}
