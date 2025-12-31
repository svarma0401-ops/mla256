package com.dsgn;


class SingletonTest1{
	public static SingletonTest1 obj;
	
	private SingletonTest1()
	{
		
	}
	
	public static synchronized SingletonTest1 getInstance()
	{
		if(obj==null)
			synchronized (SingletonTest1.class)
		{
			obj = new SingletonTest1();
		}
		return obj;
	}
}
public class SingletonThreadSafety {

	public static void main(String[] args) {
		SingletonTest1 obj1 = SingletonTest1.getInstance();
		SingletonTest1 obj2 = SingletonTest1.getInstance();
		
		System.out.println(obj1.hashCode()+" " + obj2.hashCode());

	}

}
