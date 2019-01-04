package com.example.hibernate.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.hibernate.model.TestClass;
import com.example.hibernate.util.JPAUtil;

public class App1 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		TestClass test=new TestClass();
		
		System.out.print("Enter a bcode: ");
		test.setBcode(scan.nextInt());
		
		System.out.print("Enter a title: ");
		test.setTitle(scan.next());
		
		System.out.print("Enter a price: ");
		test.setPrice(scan.nextDouble());
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(test);
		txn.commit();
		
		JPAUtil.shutdown();
	}

}
