package com.example.hibernate.main;


import javax.persistence.EntityManager;

import com.example.hibernate.model.TestClass;

import com.example.hibernate.util.JPAUtil;

public class App13 {
	public static void main(String[] args)
	{

		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		TestClass test = em.find(TestClass.class, 345);
		System.out.println(test);
		JPAUtil.shutdown();
		}

}
