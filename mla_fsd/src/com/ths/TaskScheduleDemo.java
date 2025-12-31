package com.ths;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskScheduleDemo {
	
	static class SystemTask implements Runnable
	{
		@Override
		public void run() {
			System.out.println("Running Background Task...");
		}
	}
	public static void main(String[] args) {
		
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		scheduler.scheduleAtFixedRate(new SystemTask(), 0, 5, TimeUnit.SECONDS);
		

	}

}
