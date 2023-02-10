package com.example.ReactSpringBootMaterialUi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ReactSpringBootMaterialUi.dto.EmployeeDto;
import com.example.ReactSpringBootMaterialUi.entity.Employee;
import com.example.ReactSpringBootMaterialUi.exception.ResourceNotFound;
import com.example.ReactSpringBootMaterialUi.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	String msg="employee not found with this id";
	
	public EmployeeDto saveEmployeeObject(Employee employee) {
		
		Employee save = employeeRepository.save(employee);
		
		return this.convertEntityToDto(save);
	}
	
	public EmployeeDto convertEntityToDto(Employee employee) {
		
		EmployeeDto employeeDto=new EmployeeDto();
		
		employeeDto.setEid(employee.getEid());
		employeeDto.setEname(employee.getEname());
		employeeDto.setUsername(employee.getUsername());
		employeeDto.setAddress(employee.getAddress());
		
		return employeeDto;
		
	}
	
	public List<EmployeeDto> getAllEmployeeData(){
		
		return employeeRepository.findAll().stream()
				.map(this::convertEntityToDto).toList();
		
	}
	
	public EmployeeDto getEmployeeDataById(int eid) throws ResourceNotFound {
		
		Employee orElseThrow = employeeRepository.findById(eid).orElseThrow(()->
		new ResourceNotFound(msg+eid));
		
		return this.convertEntityToDto(orElseThrow);
		
	}
	
	public EmployeeDto updateEmployeeById(int eid,Employee employee) throws ResourceNotFound {
		
		Employee orElseThrow = employeeRepository.findById(eid).orElseThrow(()->
		new ResourceNotFound(msg+eid));
		
		orElseThrow.setEname(employee.getEname());
		orElseThrow.setUsername(employee.getUsername());
		orElseThrow.setPassword(employee.getPassword());
		orElseThrow.setSalary(employee.getSalary());
		orElseThrow.setAddress(employee.getAddress());
		
		Employee save = employeeRepository.save(orElseThrow);
		
		return this.convertEntityToDto(save);
	}
	
	public Integer deleteEmployeeById(int eid) throws ResourceNotFound {
		
		Employee orElseThrow = employeeRepository.findById(eid).orElseThrow(()->
		new ResourceNotFound(msg+eid));
		
		int eid2 = orElseThrow.getEid();
		
		employeeRepository.delete(orElseThrow);
		
		return eid2;
				
	}
	
	
	
}
