package com.example.hibernate.main;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.hibernate.aggregation.bidir.Course2;
import com.example.hibernate.aggregation.bidir.Student2;
import com.example.hibernate.util.JPAUtil;

public class App6 {
	public static void main(String[] args)
	{

		TreeSet<Student2> mbaStudents=new TreeSet<Student2>();
		TreeSet<Student2> mcaStudents=new TreeSet<Student2>();
		
		mbaStudents.add(new Student2(123,"Rahul2"));
		mbaStudents.add(new Student2(456,"Kishore2"));
		mbaStudents.add(new Student2(789,"Suresh2"));
		
		mcaStudents.add(new Student2(147,"Rajest2"));
		mcaStudents.add(new Student2(257,"Ram2"));
		mcaStudents.add(new Student2(968,"Pavan2"));
		
		Course2 mca=new Course2(11,"MCA",mcaStudents);
		Course2 mba=new Course2(22,"MBA",mbaStudents);
		
		for(Student2 stud:mbaStudents)
		{
			stud.setCourse(mba);
		}
		
		for(Student2 stud:mcaStudents)
		{
			stud.setCourse(mca);
		}
		
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(mca);
		em.persist(mba);
		txn.commit();
		
		JPAUtil.shutdown();
	}

}
