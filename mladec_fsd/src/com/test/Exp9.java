package com.test;

class Book 
{
	static int pincode = 234234;
	int atmpin = 3030;
	
	public Book()
	{
		System.out.println("Constructor");
	}
	

	// factory method return statement is same name as class name
	
	
	public static Book getObj()
	{
		System.out.println("Factory Method");
		return new Book();
	}
	
	public int add() {
		return 6;
	}
	
	static 
	{
		System.out.println("Static Block " + pincode);
	}
	
	{
		System.out.println("Instance Block " + atmpin);
	}
}
public class Exp9 {

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		Book obj1 = new Book();
		
		Book obj2 = Book.getObj();
		
		Book obj3 = obj1;
		
		//Class.forName("Book");
	}

}
