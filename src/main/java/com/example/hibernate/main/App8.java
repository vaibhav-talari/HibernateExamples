package com.example.hibernate.main;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.hibernate.realization.ContractEmp;
import com.example.hibernate.realization.Emp;
import com.example.hibernate.realization.Manager;
import com.example.hibernate.util.JPAUtil;

public class App8 {
	public static void main(String[] args)
	{

		Emp e= new Emp(101,"Vamsy",12000);
		Manager m = new Manager (102,"Srinu",15000,5000);
		ContractEmp c= new ContractEmp(103,"Saranaya",1500,12);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(e);
		em.persist(m);
		em.persist(c);

		txn.commit();
		
		JPAUtil.shutdown();
	}

}
