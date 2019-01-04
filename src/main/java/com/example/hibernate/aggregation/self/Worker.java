package com.example.hibernate.aggregation.self;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Workers")
public class Worker implements Comparable<Worker> {

	
	@Id
	private int empId;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="mgrId")
	private Worker supirior;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="supirior")
	private Set<Worker> subordinates;
	
	public Worker() {}
	
	
	
	public Worker(int empId, String name, Worker supirior) {
		super();
		this.empId = empId;
		this.name = name;
		this.supirior = supirior;
		this.subordinates=new TreeSet<Worker>();
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Worker getSupirior() {
		return supirior;
	}



	public void setSupirior(Worker supirior) {
		this.supirior = supirior;
	}



	public Set<Worker> getSubordinates() {
		return subordinates;
	}



	public void setSubordinates(Set<Worker> subordinates) {
		this.subordinates = subordinates;
	}



	@Override
	public int compareTo(Worker o) {
		
		return(this.empId-o.empId);
	}

}
