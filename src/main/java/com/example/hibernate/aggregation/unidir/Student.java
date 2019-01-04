package com.example.hibernate.aggregation.unidir;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Student implements Comparable<Student> {
	
	@Id
	private int admNo;
	private String sName;
	
	public Student()
	{
		
	}
	
	

	public Student(int admNo, String sName) {
		super();
		this.admNo = admNo;
		this.sName = sName;
	}



	public int getAdmNo() {
		return admNo;
	}



	public void setAdmNo(int admNo) {
		this.admNo = admNo;
	}



	public String getsName() {
		return sName;
	}



	public void setsName(String sName) {
		this.sName = sName;
	}



	@Override
	public String toString() {
		return "Student [admNo=" + admNo + ", sName=" + sName + "]";
	}



	@Override
	public int compareTo(Student arg0) {
		
		return (this.admNo<arg0.admNo?-1:(this.admNo>arg0.admNo?1:0));
	}

}
