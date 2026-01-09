package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDemo {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee e1 = ctx.getBean("emp1",Employee.class);
		Employee e2 = ctx.getBean("emp2",Employee.class);
		System.out.println(e1);
		System.out.println(e2);

	}
}
