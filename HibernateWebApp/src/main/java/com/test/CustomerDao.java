package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class CustomerDao {
	public static Customer getCustomerById(int input)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		String hql = "from Customer where id = :id";
		
		Query query = session.createQuery(hql,Customer.class);
		
		query.setParameter("id", input);
		
		System.out.println("Customer ID : " + input);
		
		List<Customer> list = query.getResultList();
		
		t.commit();
		
		session.close();
		Customer dt =new Customer(input);
		for(Customer ct : list) {
			System.out.println(ct);
			dt = ct;
		}
		return dt;
	}
	
	public static void addcustomer(Customer cst)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		session.persist(cst);
		t.commit();
		session.close();
	}
}
