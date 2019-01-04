package com.example.hibernate.realization;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


//for TYPE 1 i.e. TABLE PER HIRARCHY
@Entity
/*@Table(name="AllEmps")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="etype",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("norm_emp")*/

//for TYPE 2 i.e. TABLE PER SUBCLASS
/*@Table(name="BaseEmp")
@Inheritance(strategy=InheritanceType.JOINED)*/

//for TYPE 3 i.e. TABLE per CONCRETE CLASS
//use this when no realtion is required between entity at all
@Table(name="OnlyEmps")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Emp {
	
	@Id
	@Column(name="eid")
	private int empNo;
	
	@Column(name="ename")
	private String eName;
	
	@Column(name="sal")
	private double sal;
	
	public Emp() {}

	public Emp(int empNo, String eName, double sal) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.sal = sal;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", eName=" + eName + ", sal=" + sal + "]";
	}
	
	

}
