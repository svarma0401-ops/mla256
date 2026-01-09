package com.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Customer ct1 = ctx.getBean("cust1",Customer.class);
		Customer ct2 = ctx.getBean("cust2",Customer.class);
		System.out.println(ct1);
		System.out.println(ct2);

	}

}
