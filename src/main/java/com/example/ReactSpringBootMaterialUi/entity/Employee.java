package com.example.ReactSpringBootMaterialUi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int eid;
	private String ename;
	private String username;
	private String password;
	private String salary;
	private String address;
	
	public Employee() {
		super();
	}
	
	public Employee(int eid, String ename, String username, String password, String salary, String address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.username = username;
		this.password = password;
		this.salary = salary;
		this.address = address;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", username=" + username + ", password=" + password
				+ ", salary=" + salary + ", address=" + address + "]";
	}
	
	

}
