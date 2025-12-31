package com.dsgn;


class SingletonTest{
	public static SingletonTest obj;
	
	private SingletonTest()
	{
		
	}
	
	public static SingletonTest getInstance()
	{
		if(obj==null)
		//  synchronized(obj)
		{
			obj = new SingletonTest();
		}
		return obj;
	}
}
public class SingletonDemo {

	public static void main(String[] args) {

		SingletonTest obj1 = SingletonTest.getInstance();
		SingletonTest obj2 = SingletonTest.getInstance();
		
		System.out.println(obj1.hashCode()+" " + obj2.hashCode());
	}

}
