package com.example.ReactSpringBootMaterialUi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ReactSpringBootMaterialUi.dto.EmployeeDto;
import com.example.ReactSpringBootMaterialUi.entity.Employee;
import com.example.ReactSpringBootMaterialUi.exception.ResourceNotFound;
import com.example.ReactSpringBootMaterialUi.service.EmployeeService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value = "/addEmployeeData")
	public ResponseEntity<EmployeeDto> saveEmployeeObject(@RequestBody Employee employee){
		
		EmployeeDto saveEmployeeObject = employeeService.saveEmployeeObject(employee);
		
		return new ResponseEntity<>(saveEmployeeObject,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getAllEmployeeData")
	public ResponseEntity<List<EmployeeDto>> getAllEmployeeObject(){
		
		List<EmployeeDto> allEmployeeData = employeeService.getAllEmployeeData();
		
		return new ResponseEntity<>(allEmployeeData,HttpStatus.ACCEPTED);
		
	}
	

	@GetMapping(value = "/getEmployeeDataById/{eid}")
	public ResponseEntity<EmployeeDto> getSingleEmployeeObject(@PathVariable int eid) throws ResourceNotFound{
		
		EmployeeDto employeeDataById = employeeService.getEmployeeDataById(eid);
		
		return new ResponseEntity<>(employeeDataById,HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping(value = "/updateEmployeeById/{eid}")
	public ResponseEntity<EmployeeDto> updateEmployeeById(@PathVariable int eid,@RequestBody Employee employee) throws ResourceNotFound {
		
		EmployeeDto updateEmployeeById = employeeService.updateEmployeeById(eid, employee);
		
		return new ResponseEntity<>(updateEmployeeById,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping(value = "/deleteEmployeeById/{eid}")
	public ResponseEntity<Map<String,Integer>> deleteEmployeeById(@PathVariable int eid) throws ResourceNotFound{
		
		Integer deleteEmployeeById = employeeService.deleteEmployeeById(eid);
		
		Map<String,Integer>map=new HashMap<>();
		
		map.put("deleted id is", deleteEmployeeById);
		
		return new ResponseEntity<>(map,HttpStatus.NO_CONTENT);
		
	}
	
	
	
	
	
	

}
