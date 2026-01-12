package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDemo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDao empdao = ctx.getBean("edao1",EmployeeDao.class);
		Employee emp = new Employee();

		emp.setE_name("Gill"); 
		emp.setE_cmp("IPL"); 
		emp.setE_city("Gujarat");

		empdao.insertEmployee(emp);
		
		EmployeeDao empdao1 = ctx.getBean("edao2",EmployeeDao.class);
		Employee emp1 = new Employee();
		
	    //emp1.setId(2);
		
		//empdao.updateEmployee(emp);
		//empdao.createEmployee(emp);
		//empdao.deleteEmployee(emp);
		
	    System.out.println(empdao1.getAllEmployees());
		System.out.println("Employee Data Updated");
		
	}
}
