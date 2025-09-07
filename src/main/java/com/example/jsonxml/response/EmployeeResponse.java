package com.example.jsonxml.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JacksonXmlRootElement(localName = "Employee")
public class EmployeeResponse {
	
	private int id;
	private String name;
	private int age;
	private String department;
	private double salary;
	private String designation;
	private String location;
	
}
