package com.test;
 
import java.util.Arrays;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class TestMappings {
 
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory(); 
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Address adr1 = new Address();
		
		adr1.setCity("Bangalore");
		adr1.setState("KA");
		adr1.setCountry("India");
		
		Address adr2 = new Address();
		
		adr2.setCity("Mumbai");
		adr2.setState("MA");
		adr2.setCountry("India");
		
//		Employee emp = new Employee();
//		
//		emp.setE_name("Ayush");
//		emp.setE_company("Mphasis");
//		emp.setAddress(adr);
		
		Student std = new Student();
		std.setStd_name("Ayush");
		std.setAddresses(Arrays.asList(adr1,adr2));
		
		session.persist(adr1);
		session.persist(adr2);
		session.persist(std);
		
//		session.persist(emp);
		
		t.commit();
		
		System.out.println("Done");
		
		session.close();
	}
 
}