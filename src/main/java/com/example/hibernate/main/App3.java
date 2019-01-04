package com.example.hibernate.main;

import java.time.LocalDate;
import java.time.Month;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.hibernate.compoistion.Address;
import com.example.hibernate.compoistion.Employee;
import com.example.hibernate.model.Gender;
import com.example.hibernate.util.JPAUtil;

public class App3 {
	public static void main(String[] args)
	{
Employee emp=new Employee("TEST VENKAT",Gender.Masculine,
		LocalDate.of(1998,Month.OCTOBER,2)
		,new Address("66-11-5","Vizag","Andhra Pradesh")
		);	
System.out.println(LocalDate.of(1998,Month.OCTOBER,2));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(emp);
		txn.commit();
		
		JPAUtil.shutdown();
	}

}
