package com.example.hibernate.main;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.hibernate.aggregation.self.Worker;
import com.example.hibernate.util.JPAUtil;

public class App7 {
	public static void main(String[] args)
	{

		Worker manager =new Worker (101,"Srinu",null);	
		
		Worker w1 =new Worker (202,"Saranyaw",manager);	
		Worker w2 =new Worker (405,"Venkat",manager);	
		
		manager.setSubordinates(new TreeSet<Worker>());
		manager.getSubordinates().add(w1);
		manager.getSubordinates().add(w2);

		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(manager);
		txn.commit();
		
		JPAUtil.shutdown();
	}

}
