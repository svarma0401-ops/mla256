package com.test;


public final class PracImmutable {
	
	private final String name;
	private final int age;
	
	public PracImmutable(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		
		PracImmutable om = new PracImmutable("Rohit", 20);
		
		System.out.println("name : " + om.getName() + ", Age : " + om.getAge());
	
	}

}
