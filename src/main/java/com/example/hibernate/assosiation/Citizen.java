package com.example.hibernate.assosiation;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="citizens")
public class Citizen {
	
	@Id
	private String aadharId;
	private String name;
	
	//CascadeType.ALL will update all the pbject linked to it i.e all effects happening on 
	//citizen will happen in banl account if we choose .ALL
	@OneToOne(mappedBy="accountHolder",cascade=CascadeType.ALL)
	private BankAccount bankAccount;

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	

}
