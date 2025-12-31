package com.dsgn;

class Parent1{
	public void greetUser() {
		System.out.println("Parent");
	}
}

class Child1 extends Parent1 {
	
	public void sendMsg(String msg) {
		greetUser();
		
		System.out.println("Calling Parent Method " +msg);
		
	}
	
	@Override
	public void greetUser()
	{
		System.out.println("Overrided");
		sendMsg("Hi Factory Method");
	}
	
	// factory method
	public static Parent1 getInstance()
	{
		return new Parent1();
	}
}

public class FactoryDemo {

	public static void main(String[] args) {
		
		Parent1 obj = Child1.getInstance();
		obj.greetUser();
		
	}

}
