package com.learners.Students;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



public class StudentsInsert {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory;
		Transaction tx = null;
		
		
		try {
			
		AnnotationConfiguration afg = new AnnotationConfiguration();			
		afg = (AnnotationConfiguration) afg.configure();
		sessionFactory = afg.buildSessionFactory();			
		Session session = sessionFactory.openSession();
		tx = session.beginTransaction();
		
		
		
		Students stu= new Students(0, "Raju", "java", 12345);
		Students stu1= new Students(0, "Harish", "java",123456);
		Students stu2= new Students(0, "Raj", "C", 123457);
		Students stu3= new Students(0, "Harsha", "C", 123458);
		Students stu4= new Students(0, "Ram", "C++", 123459);
		Students stu5= new Students(0, "Ramu", "C++", 123450);
		
		
		session.save( stu);
		session.save( stu1);
		session.save( stu2);
		session.save( stu3);
		session.save( stu4);
		session.save( stu5);
		 tx.commit();
			session.close();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
			

		}
		
		
		
		
		
		
	}
