package com.learners.Teachers;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;




public class TeachersInsert {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory;
		Transaction tx = null;
		
		
		
		try {
		
			AnnotationConfiguration afg = new AnnotationConfiguration();			
			afg = (AnnotationConfiguration) afg.configure();
			sessionFactory = afg.buildSessionFactory();			
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			
			Teachers tea= new Teachers(0, "Firdous", "Java", 123456);
			Teachers tea1= new Teachers(0, "Mohit", "C", 1234567);
			Teachers tea2= new Teachers(0, "OM", "C++", 123456);
			
			session.save( tea);
			session.save(tea1);
			session.save( tea2);
			 tx.commit();
				session.close();
			
			
				
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
			

		}
		
		
		
		
		
		
	}
