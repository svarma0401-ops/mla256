package com.dtm;

import java.util.ArrayList;
import java.util.List;

class Customer1 {
	
	private String name;
	
	public Customer1(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Customer[ name: " + name ;
	}
	
}

class CustomerUtils {

	 // Print customers whose name STARTS WITH a given prefix
	    public static void printStartsWith(List<?> list, String prefix) {
	        for (Object obj : list) {
	            Customer1 c = (Customer1) obj;   // simple beginner cast
	            if (c.getName().startsWith(prefix)) {
	                System.out.println(c);
	            }
	        }
	    }

	    // Print customers whose name ENDS WITH a given suffix
	    public static void printEndsWith(List<?> list, String suffix) {
	        for (Object obj : list) {
	            Customer1 c = (Customer1) obj;
	            if (c.getName().endsWith(suffix)) {
	                System.out.println(c);
	            }
	        }
	    }

}


public class PeracUnBound {

	public static void main(String[] args) {


List<Customer1> customers = new ArrayList<>();
        customers.add(new Customer1("Alice"));
        customers.add(new Customer1("Alicia"));
        customers.add(new Customer1("Bob"));
        customers.add(new Customer1("Chris"));

        System.out.println("Names starting with 'Al':");
        CustomerUtils.printStartsWith(customers, "Al");

        System.out.println("\nNames ending with 's':");
        CustomerUtils.printEndsWith(customers, "s");

		
	}

}
