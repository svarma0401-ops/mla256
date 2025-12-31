package com.strs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exp4 {

	public static void main(String[] args) {
	
		String str = "java";
		System.out.println(Pattern.matches(str, "java"));
		
		System.out.println(Pattern.matches("[a-zA-Z]", "a"));
		
		String pwdptrn = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%&()_+-])(?=\\S+$).{8,20}$";
		
		final Pattern ptrn = Pattern.compile(pwdptrn);
		
		String pass = "Java@12345";
		
		Matcher mt = ptrn.matcher(pass);
		
		System.out.println(mt.matches());
	}

}
