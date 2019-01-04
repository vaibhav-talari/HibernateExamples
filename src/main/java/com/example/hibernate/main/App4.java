package com.example.hibernate.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.hibernate.assosiation.BankAccount;
import com.example.hibernate.assosiation.Citizen;

import com.example.hibernate.util.JPAUtil;

public class App4 {
	public static void main(String[] args)
	{

		BankAccount acc=new BankAccount();
		acc.setAccNumber("SB001");
		acc.setBal(23000);
		
		Citizen c= new Citizen();
		c.setAadharId("98989898769");
		c.setBankAccount(acc);
		c.setName("Srinu");
		
		acc.setAccountHolder(c);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(c);
		txn.commit();
		
		JPAUtil.shutdown();
	}

}
