package com.strs;

public class Exp1 {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = "hello";
		String e = "java";
		
		String c = new String("hello");
		String d = new String("hello");
		
		System.out.println(a == b);
		System.out.println(a == e);
		System.out.println(a == c);
		System.out.println(b == d);
		System.out.println( c==d );
		
		System.out.println(b.equals(d));
		
		a.concat("hi byy ");
		 System.out.println(a);

	}

}
