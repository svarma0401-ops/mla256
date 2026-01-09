package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDemo {

	public static void main(String[] args) {
	
		BeanFactory bn = new ClassPathXmlApplicationContext("beans.xml");
		
		//Employee obj = bn.getBean("emp",Employee.class);
		Employee obj = (Employee)bn.getBean("emp");
		
		System.out.println(obj);
		
		System.out.println("Constructor data");
		
		Employee obj1 = bn.getBean("emp1",Employee.class);
		System.out.println(obj1);
	}

}
