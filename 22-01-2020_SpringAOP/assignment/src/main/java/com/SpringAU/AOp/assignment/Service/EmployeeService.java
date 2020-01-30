package com.SpringAU.AOp.assignment.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringAU.AOp.assignment.model.Employee;

@Service
public class EmployeeService {
	List<Employee> emp;

	public void set() {
		emp = new ArrayList<Employee>();
		emp.add(new Employee("Saurabh", 1));
		emp.add(new Employee("Karthik", 2));
		emp.add(new Employee("Shashank", 3));
	}

	public void display() {
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i));
		}
	}

	public void getall() {
		set();
		display();
	}

}
