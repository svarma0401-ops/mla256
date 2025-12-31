package com.voter;

public class voterData {

	public void checkAge(int age)
	{
		if(age>=18)
		{
			System.out.println("Valid Age");
		}
		else
		{
			ValidAgeException ve = new ValidAgeException("invalid age");
			throw(ve);
		}
	}
}
