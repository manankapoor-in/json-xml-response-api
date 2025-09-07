package com.example.jsonxml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsonxml.response.EmployeeResponse;
import com.example.jsonxml.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/employee", produces = { "application/json", "application/xml" })
	public List<EmployeeResponse> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping(value = "/employee/{id}", produces = { "application/json", "application/xml" })
	public EmployeeResponse getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
}
