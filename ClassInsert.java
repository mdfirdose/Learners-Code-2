package com.learners.Classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;




public class ClassInsert {
	public static void main(String[] args) {
	
	SessionFactory sessionFactory;
	Transaction tx = null;
	
	
	

	try {
	
	AnnotationConfiguration afg = new AnnotationConfiguration();			
	afg = (AnnotationConfiguration) afg.configure();
	sessionFactory = afg.buildSessionFactory();			
	Session session = sessionFactory.openSession();
	tx = session.beginTransaction();

	
          Classes cls= new Classes(1, "JAVA", "Firdous","9.30am to 11.30am", 2, null);
          Classes cls1= new Classes(2, "C", "Mohit","11.30am to 01.30Pm", 2, null);
          Classes cls2= new Classes(1, "C++", "Om","02.30pm to 04.30pm", 2, null);
          
          
          
      	session.save( cls);
		session.save(cls1);
		session.save( cls2);
		 tx.commit();
			session.close();
			
			
			
	} catch (Exception e) {
		e.printStackTrace();
		if (tx != null)
			tx.rollback();
	}
		
			
			
			
 
	
	
	
	
}
}