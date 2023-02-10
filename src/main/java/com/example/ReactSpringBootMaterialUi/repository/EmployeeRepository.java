package com.example.ReactSpringBootMaterialUi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ReactSpringBootMaterialUi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
