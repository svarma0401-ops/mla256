package com.test;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigStudent.class);
		
		Student s1 = ctx.getBean("getSetterObj",Student.class);
		
		s1.setId(101);
		s1.setName("Raj");
		s1.setSkills(Arrays.asList("java","python"));
		s1.setCollege("RJ");
		
		System.out.println(s1);
		
		Student s2 = ctx.getBean("getConstObj",Student.class);
		System.out.println(s2);
		
		BeanFactory bn = new ClassPathXmlApplicationContext("beans.xml");
		Student s3 = (Student)bn.getBean("std");
		System.out.println(s3);
	}

}
