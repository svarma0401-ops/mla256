package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.dao.EmployeeDao;
import com.test.model.Employee;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Employee API",description = "Simple CRUD Operations")
public class EmployeeController {
	
	@Autowired
	private EmployeeDao dao;
	
	@PostMapping(value = "/create",consumes="application/json")
	@Operation(description = "Add Employee Operation")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp)
	{
		int id = dao.getAllEmployees().size() + 1;
		emp.setId(id);
		Employee data = dao.addEmployee(emp);
		
		if(data!= null) {
			return new ResponseEntity<>(data,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>(data,HttpStatus.NO_CONTENT);
		}
	}
	
	@PutMapping(value = "/update/{id}",consumes="application/json")
	@Operation(description = "Update Employee Operation")
	public ResponseEntity<Employee> updateEmployee(@PathVariable int id,@RequestBody Employee emp){
		emp.setId(id);
		Employee data = dao.addEmployee(emp);
		
		if(data!= null) {
			return new ResponseEntity<>(data,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>(data,HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping(value="/delete/{id}",produces = "application/json")
	@Operation(description = "Delete Employee Operation")
	public ResponseEntity<List<Employee>> deleteEmployee(@PathVariable int id){
		List<Employee> data = dao.deleteEmployee(id);
		
		if(id != 0) {
			return new ResponseEntity<>(data,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>(data,HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	@Operation(description = "Get ALL Employee Operation")
	public ResponseEntity<List<Employee>> getALLEmployees()
	{
		List<Employee> data = dao.getAllEmployees();
		if(data.isEmpty()) {
			return new ResponseEntity<>(data,HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
	}
}
