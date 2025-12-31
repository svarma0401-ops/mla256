package com.test;

public class Employee {

	int id;
	String name;
	String cmp;
	
	public Employee()
	{
		System.out.println("Default Constructor");
	}
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
		System.out.println("Parameterized Constructor " + id + " " +name );
	}
	
	public Employee(int id, String name,String cmp)
	{
		this.id = id;
		this.name = name;
		this.cmp= cmp;
		System.out.println("Overloaded Constructor " + id + " " + name + " " + cmp);
	}
	
	public Employee(Employee obj)
	{
		System.out.println("Object Parameterised Constructor");
	}
	
	public static void main(String[] args) {
		
		Employee obj1 = new Employee();
		Employee obj2 = new Employee ( 1,"Uchit Seth");
		Employee obj3 = new Employee ( 1,"Uchit","Mphasis");
		Employee obj4 = new Employee(obj1);
	}

}
