package com.example.hibernate.realization;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//TYPE 1
/*@DiscriminatorValue("cont_emp")
*/
//TYPE 2
/*@Table(name="CEmps")*/

//TYPE 3
@Table(name="OnlyCEmps")
public class ContractEmp extends Emp {
	
	@Column(name="cdur")
	private int contractDur;
	
	public ContractEmp() {}

	public ContractEmp(int empNo,String eName,double sal,int contractDur) {
		super(empNo,eName,sal);
		this.contractDur = contractDur;
	}

	public int getContractDur() {
		return contractDur;
	}

	public void setContractDur(int contractDur) {
		this.contractDur = contractDur;
	}
	
	
	
	

}
