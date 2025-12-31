package com.strms;

import java.util.Arrays;
import java.util.List;

public class Exp2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("sky","kohli","dravid","rohit","dhoni");
		
		names.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		List<Integer> nums = Arrays.asList(2,4,6,8,10);
		
		nums.stream()
		.map(x -> x*x)
		.forEach(System.out::println);
	}

}
