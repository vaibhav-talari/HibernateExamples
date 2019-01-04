package com.example.hibernate.main;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.example.hibernate.model.TestClass;

import com.example.hibernate.util.JPAUtil;

public class App10 {
	public static void main(String[] args)
	{

		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		String qry="select b.title from TestClass b";
		
		Query sql = em.createQuery(qry);
		List<String> titles=sql.getResultList();

		for(String tt:titles)
		
			System.out.println(tt);
		
		
		qry="select b.title,b.price from TestClass b";
		sql = em.createQuery(qry);

		
		List<Object[]> records=sql.getResultList();
		for(Object[] rec:records)
		
			System.out.println(rec[0]+"\t"+rec[1]);
			JPAUtil.shutdown();

		
		
		
		
	}

}
