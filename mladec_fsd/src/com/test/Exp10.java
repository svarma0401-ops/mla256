package com.test;

interface Inf1
{
	float pi = 3.14f;
	void cat();
}

abstract class Abs{
	public abstract void disp();
	public void show()
	{
		System.out.println("Implemented method from abs");
	}
}

class Impl1 extends Abs{
	@Override
	public void disp()
	{
		System.out.println("Abs method Overrided");
	}
	
	public void cat()
	{
		System.out.println("inf method overrided");
	}
	
	public void dog()
	{
		System.out.println("concrete class method");
	}
}

public class Exp10 {

	public static void main(String[] args) {
	
		Impl1 obj = new Impl1();
		
		obj.cat();
		obj.disp();
		obj.show();
		obj.dog();

	}

}
