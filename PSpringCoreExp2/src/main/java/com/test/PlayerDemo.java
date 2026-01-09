package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerDemo {

	public static void main(String[] args) {
		

		BeanFactory bn = new ClassPathXmlApplicationContext("beans.xml");
		
		//Employee obj = bn.getBean("emp",Employee.class);
		Player obj1 = (Player)bn.getBean("p1");
		
		System.out.println(obj1);
		
	//	System.out.println("Constructor data");
		
		Player obj2 = bn.getBean("p2",Player.class);
		System.out.println(obj2);

	}

}
