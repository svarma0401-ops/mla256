package com.test;


interface Inf3 
{
	void add();
	
	interface Inf4
	{
	void sub();
	}
}

class Impl3 implements Inf3, Inf3.Inf4
{
	@Override
	public void sub()
	{
		System.out.println("sub()");
	}
	
	@Override
	public void add()
	{
		System.out.println("add()");
	}
}
public class Exp12 {

	public static void main(String[] args) {
		
		Impl3 obj = new Impl3();
		obj.sub();
		obj.add();
	}

}
