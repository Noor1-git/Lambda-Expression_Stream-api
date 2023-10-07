package edu.jsp.sort_employees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeDriver {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "Abc1", 123, "abc@123"));
		employees.add(new Employee(5, "Abc5", 523, "abc@123"));
		employees.add(new Employee(3, "Abc3", 323, "abc@123"));
		employees.add(new Employee(3, "Abc3", 323, "abc@123"));
		employees.add(new Employee(4, "Abc4", 423, "abc@123"));
		employees.add(new Employee(4, "Abc4", 423, "abc@123"));
		employees.add(new Employee(2, "Abc2", 223, "abc@123"));
		employees.add(new Employee(2, "Abc2", 223, "abc@123"));
		
		Set<Employee> employees2=new HashSet<>(employees);
		System.out.println(employees2);

////		Sort Employees Based on Id;
//		Collections.sort(employees, (e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
//		System.out.println(employees);
//
////		Sort Employees Based on Contact;
//		Collections.sort(employees, (e1, e2) -> Long.compare(e1.getContact(), e2.getContact()));
//		System.out.println(employees);
//
////		Sort Employees Based on Name;
//		Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
//		System.out.println(employees);
//
////		Sort Employees Based on Password;
//		Collections.sort(employees, (e1, e2) -> e1.getPassword().compareTo(e2.getPassword()));
//		System.out.println(employees);
	}

}
