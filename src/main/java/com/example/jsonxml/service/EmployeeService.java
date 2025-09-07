package com.example.jsonxml.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.jsonxml.response.EmployeeResponse;

@Service
public class EmployeeService {

	private static final List<EmployeeResponse> employees = new ArrayList<>();

	static {
		EmployeeResponse e1 = new EmployeeResponse();
		e1.setId(1);
		e1.setName("Manan");
		e1.setAge(29);
		e1.setDepartment("Digital & Technology");
		e1.setSalary(2500000.00);
		e1.setDesignation("Sr. Software Engineer");
		e1.setLocation("Noida, India");

		EmployeeResponse e2 = new EmployeeResponse();
		e2.setId(2);
		e2.setName("Amit");
		e2.setAge(35);
		e2.setDepartment("Engineering");
		e2.setSalary(1800000.00);
		e2.setDesignation("Jr Software Architect");
		e2.setLocation("Noida, India");

		employees.add(e1);
		employees.add(e2);
	}

	public List<EmployeeResponse> getAllEmployees() {
		return employees;
	}

	public EmployeeResponse getEmployeeById(int id) {
		return employees.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);
	}
	
}
