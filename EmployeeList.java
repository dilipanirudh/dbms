package utils;

import java.util.ArrayList;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> emplist=new ArrayList<>();
		emplist.add(new Employee(101,"deloitte",5000));
		emplist.add(new Employee(201,"nexwave",7000));
		for(Employee emp:emplist)
			System.out.println(emp.getEmpName()+" "+emp.getEmpId()+" "+emp.getSalary());

	}

}
