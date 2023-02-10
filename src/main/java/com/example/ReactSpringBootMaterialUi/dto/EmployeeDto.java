package com.example.ReactSpringBootMaterialUi.dto;

public class EmployeeDto {
	
	private int eid;
	private String ename;
	private String username;
	private String address;
	
	public EmployeeDto() {
		super();
	}

	public EmployeeDto(int eid, String ename, String username, String address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.username = username;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDto [eid=" + eid + ", ename=" + ename + ", username=" + username + ", address=" + address + "]";
	}
	
	

}
