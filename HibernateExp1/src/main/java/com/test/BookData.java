package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookData {

	public static void main(String[] args) {
		
		// Create Configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Book obj = new Book();//Transient State
		obj.setB_name("Hibernate Notes");
		obj.setB_author("Gavin King");
		obj.setB_price(500);

		//session.persist(obj);//Persistence State
		//t.commit();
		
		
		Book dt = session.get(Book.class, 52);
		System.out.println(dt.getId()+" "+dt.getB_name()+" "+dt.getB_author()+" "+dt.getB_price());
		
		dt.setB_name("Spring Boot");
		dt.setB_author("Jayesh");
		dt.setB_price(290);
		
		//session.persist(dt);
		
		session.remove(dt);
		t.commit();
		System.out.println("Done.");
		
		session.close();//Detached State
	}

}
