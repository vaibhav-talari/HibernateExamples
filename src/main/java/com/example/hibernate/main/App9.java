package com.example.hibernate.main;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.example.hibernate.model.TestClass;
import com.example.hibernate.realization.ContractEmp;
import com.example.hibernate.realization.Emp;
import com.example.hibernate.realization.Manager;
import com.example.hibernate.util.JPAUtil;

public class App9 {
	public static void main(String[] args)
	{

		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		String qry="select b from TestClass b";
		
		Query sql = em.createQuery(qry);
		@SuppressWarnings("unchecked")
		List<TestClass> test=sql.getResultList();
		
		for(TestClass txt:test)
		{
			System.out.println(test);
		}
		
		
		
		JPAUtil.shutdown();
	}

}
