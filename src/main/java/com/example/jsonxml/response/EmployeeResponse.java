package com.example.jsonxml.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JacksonXmlRootElement(localName = "Employee") // This is optional, if we do not use this then EmployeeResponse will be used as an root element tag
public class EmployeeResponse {
	
	private int id;
	private String name;
	private int age;
	private String department;
	private double salary;
	private String designation;
	private String location;
	
}
