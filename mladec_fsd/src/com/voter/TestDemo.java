package com.voter;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) throws ValidAgeException{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Age");
		
		int age = sc.nextInt();
		
		voterData obj = new voterData();
		try {
			obj.checkAge(age);
		} catch (ValidAgeException ve) {
			System.out.println("Check your age");
		}

	}

}
