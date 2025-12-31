package com.test;

@FunctionalInterface

interface FunInf
{
	String greetUser(String msg);
	
	static void  cat()
	{
		System.out.println("Funinf cat");
	}
	
	default void dog()
	{
		System.out.println("funinf dog");
		fox();
	}
	
	private void fox()
	{
	 System.out.println("funinf fox()");
	}
}

public class Exp13 {

	public static void main(String[] args) {
		
		FunInf obj = (String msg) -> {
			System.out.println("funinf overrided");
			return msg;
		};
		
		System.out.println(obj.greetUser("Hi Hello..."));
		obj.dog();
		FunInf.cat();
	}
}
