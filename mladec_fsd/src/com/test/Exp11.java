package com.test;

interface Inf2
{
	public void book();
	
	private void color()
	{
		System.out.println("Private Method");
	}
	
	static void human()
	{
		System.out.println("Static Method");
	}
	
	default void animal()
	{
		System.out.println("default method");
		
		color();
	}
}


class Impl2 implements Inf2
{
	@Override
	public void book()
	{
		System.out.println("Implemented method");
	}
}


public class Exp11 {

	public static void main(String[] args) {
		Inf2 obj = new Impl2();
		obj.book();
		obj.animal();
		Inf2.human();

	}

}
