package com.example.hibernate.realization;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
/*@DiscriminatorValue("mang_emp")*///TYpe 1
/*@Table(name="Mgrs")//type 2
 * 
*/
@Table(name="OnlyMagrs")
public class Manager extends Emp{
	
	@Column(name="hra")
	private double hra;
	
	public Manager() {}

	public Manager(int empNo,String eName,double sal,double hra) {
		super(empNo,eName,sal);
		this.hra = hra;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}
	
	
	
	

}
