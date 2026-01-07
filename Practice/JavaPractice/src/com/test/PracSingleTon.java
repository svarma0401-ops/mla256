package com.test;

import java.time.LocalDateTime;

class SingleTon {
	private static SingleTon instance;
	
	private LocalDateTime createdTime;
	
	private SingleTon() {
		createdTime = LocalDateTime.now();
	}
	
	public static SingleTon getInstance() {
		if (instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
	
	public LocalDateTime getCreatedTime() {
		return createdTime;
	}
	
}

public class PracSingleTon {

	public static void main(String[] args) throws InterruptedException {
		
		SingleTon s1 = SingleTon.getInstance();
		System.out.println("Instance 1 created at : " + s1.getCreatedTime());
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		Thread.sleep(3000);
		SingleTon s2 = SingleTon.getInstance();
		
		System.out.println("Instance 1 created at : " + s1.getCreatedTime());
		System.out.println("Instance 2 created at : " + s2.getCreatedTime());
		
	}

}
