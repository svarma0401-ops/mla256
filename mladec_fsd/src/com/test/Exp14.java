package com.test;

@FunctionalInterface

interface FunInf1
{
	void userData();
}
public class Exp14 {

	public static void main(String[] args) {
		
		// Before JDK 8 IMPLEMENTATION
		
		FunInf1 obj = new FunInf1() {
			
			@Override
			public void userData()
			{
				System.out.println("Overrided");
			}
		};
		
		obj.userData();
		
		
		// After JDK 8 IMPLEMENTATION
		
		new FunInf1() {
			@Override
			public void userData()
			{
				System.out.println("nameless object");
			}
		}.userData();
	}

}
