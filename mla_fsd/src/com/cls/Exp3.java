package com.cls;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Exp3 {

	public static void main(String[] args) {
	
		//HashSet data = new HashSet();
		//LinkedHashSet data = new LinkedHashSet();
		
		TreeSet data = new TreeSet();
		data.add(100);
		data.add("JAVA");
		data.add('a');
		data.add(1000);
		data.add(100);
		data.add(22.222f);
		data.add(true);
		data.add("hello");
		System.out.println(data);
		
		System.out.println(data.size());
		
		System.out.println("=================================================");
		
		Iterator itr = data.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
			
		}
	

	}

}
