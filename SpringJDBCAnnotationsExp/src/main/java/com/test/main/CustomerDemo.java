package com.test.main;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.DBConfig;
import com.test.dao.CustomerDao;
import com.test.model.Customer;


public class CustomerDemo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);
		
		CustomerDao cdao = ctx.getBean(CustomerDao.class);
		
		Customer c1 = new Customer();
		
		c1.setId(2);
		c1.setFirstName("SKY");
		c1.setLastName("Yadav");
		c1.setLocation("Mumbai");
		
//		cdao.createCustomer(c1);
	
//		c1.setId(2);
//		cdao.deleteCustomer(c1);
//		Customer c3 = new Customer(3,"Dhoni","Singh","Chennai");
//		cdao.createCustomer(c3);

		cdao.updateCustomer(c1);
		List<Customer> listCustomer = cdao.getAllCustomers();
		listCustomer.forEach(System.out::println);
	
		System.out.println("Customer updated");
	}
	
	
	
}
