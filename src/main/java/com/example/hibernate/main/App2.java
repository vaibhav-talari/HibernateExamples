package com.example.hibernate.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.hibernate.model.Gender;
import com.example.hibernate.model.Person;
import com.example.hibernate.util.JPAUtil;

public class App2 {
	public static void main(String[] args)
	{
		Person p=new Person("Srinu","Das",Gender.Masculine,false,new Date(1995,06,11));
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(p);
		txn.commit();
		
		JPAUtil.shutdown();
	}

}
