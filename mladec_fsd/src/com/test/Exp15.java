package com.test;

import java.util.Arrays;
import java.util.List;


public class Exp15 {

	public static void main(String[] args) {
		
		String [] names = {"rohit","kohli","tilak","rahul","hardik"};
		
		Arrays.sort(names);
		System.out.println(names);
		
		for(String dt : names)
		{
			System.out.println(dt);
		}
		
		List <String> list = Arrays.asList(names);
		
		//System.out.println(list);
		
		//list.forEach(x -> System.out.println(x));
		
		list.forEach(System.out::println);
	}

}
