package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Student {
	@Id
	private int rollNo;
	private String name;
	private String school;

	public int getrollNo() {
		return rollNo;
	}

	public void setrollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", school=" + school + "]";
	}
	
	

}
