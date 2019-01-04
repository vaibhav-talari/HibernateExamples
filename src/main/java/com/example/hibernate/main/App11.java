package com.example.hibernate.main;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.example.hibernate.model.TestClass;

import com.example.hibernate.util.JPAUtil;

public class App11 {
	public static void main(String[] args)
	{

		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		String qry="select b from TestClass b where b.price between :limit1 and :limit2";
		
		Query sql = em.createQuery(qry);
		sql.setParameter("limit1",500.0);
		sql.setParameter("limit2",5000.0);

		List<TestClass> books=sql.getResultList();
		for(TestClass tt:books)
			System.out.println(tt);
			JPAUtil.shutdown();

		
		
		
		
	}

}
