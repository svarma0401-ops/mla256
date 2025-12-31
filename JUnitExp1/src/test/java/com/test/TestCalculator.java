package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("MLA JUnit Test")
@SelectClasses({ TestCalculator.class})
	
public class TestCalculator {
	Calculator obj;
	
	//@BeforeClass JUnit-4
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("Before all test cases");
	}
	
	//@AfterClass JUnit-4
	@AfterAll
	public static void afterAll() {
		System.out.println("After all test cases");
	}
	
	//@Before JUnit-4
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("Before each test method");
		obj =new Calculator();
	}
	
	//@After JUnit-4
	@AfterEach
	public void afteEach() {
		System.out.println("After each test method");
		obj = null;
	}
	
	//@Test JUnit-4
	@Test
	@Timeout(value = 5, unit = TimeUnit.SECONDS)
	public void testAdd() {
		System.out.println("Test add method");
		assertEquals(20,obj.add(10,10));
	}
	
	     //@Test JUnit-4
		@Test
		public void testSub() {
			System.out.println("Test sub method");
			assertEquals(20, obj.sub(30, 10));
		}
		
		//@Test JUnit-4
		@Test
		public void testMul() {
			System.out.println("Test mul method");
			assertEquals(25, obj.mul(5, 5));
		}

		//@Test JUnit-4
		@Test
		public void testListNames() {
			System.out.println("Test list data");
			List<String> names = Arrays.asList("rohit","Virat","dhoni");
			assertEquals(3, obj.listnames(names).size());
		}
		
		 //@Test JUnit-4
		@Test
		public void testGreetUser() {
			System.out.println("Test greetUser method");
			assertEquals("Hello ,Hi ", obj.greetUser("Hello ,Hi "));
		}
		
		@ParameterizedTest
		@ValueSource(strings = {"",""})
		public void testIsEmpty(String str) {
			Assertions.assertTrue(obj.isEmpty(str));
		}
		@Test
		public void testAge() {
			IllegalArgumentException excp = assertThrows(IllegalArgumentException.class,() ->obj.checkAge(-6));
			assertEquals("Age must be greater than zero", excp.getMessage());
			
		}	
}
