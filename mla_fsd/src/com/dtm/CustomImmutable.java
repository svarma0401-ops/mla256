package com.dtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class TestImmutable
{
	private final String msg = "hello don";
	
	private final List<String> names = Arrays.asList("King");
	
	public TestImmutable()
	{
		
	}

	public String getMsg() {
		return msg;
	}

	public List<String> getNames() {
		return names;
	}
	
	public List<String> getListNames()
	{
		System.out.println(getMsg());
		return Collections.unmodifiableList(names);
	}
}
public class CustomImmutable {

	public static void main(String[] args) {
		
		TestImmutable obj = new TestImmutable();
		System.out.println(obj.getListNames());
	}
}
