package com.tnsif.studentservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Student {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "reg_no")
	private long reg_no;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "dob")
	private LocalDate dob;
	
	@Column(name = "dept")
	private String dept;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getReg_no() {
		return reg_no;
	}

	public void setReg_no(long reg_no) {
		this.reg_no = reg_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
