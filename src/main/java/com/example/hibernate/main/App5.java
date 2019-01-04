package com.example.hibernate.main;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.hibernate.aggregation.unidir.Course;
import com.example.hibernate.aggregation.unidir.Student;


import com.example.hibernate.util.JPAUtil;

public class App5 {
	public static void main(String[] args)
	{

		TreeSet<Student> mbaStudents=new TreeSet<Student>();
		TreeSet<Student> mcaStudents=new TreeSet<Student>();
		
		mbaStudents.add(new Student(123,"Rahul"));
		mbaStudents.add(new Student(456,"Kishore"));
		mbaStudents.add(new Student(789,"Suresh"));
		
		mcaStudents.add(new Student(147,"Rajest"));
		mcaStudents.add(new Student(257,"Ram"));
		mcaStudents.add(new Student(968,"Pavan"));
		
		Course mca=new Course(1,"MCA",mcaStudents);
		Course mba=new Course(2,"MBA",mbaStudents);
		
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(mca);
		em.persist(mba);
		txn.commit();
		
		JPAUtil.shutdown();
	}

}
