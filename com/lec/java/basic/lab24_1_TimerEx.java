package com.lec.java.basic;

import java.util.Timer;

public class lab24_1_TimerEx {

	public lab24_1_TimerEx() throws InterruptedException {
		// TODO Auto-generated constructor stub
		System.out.println("^^");
		Timer timer = new Timer(true);
		lab24_1_TimerTask1 t1 = new lab24_1_TimerTask1();
		lab24_1_TimerTask2 t2 = new lab24_1_TimerTask2();
		
		timer.schedule(t1, 2000);
		timer.schedule(t2, 7000);
		
		Thread.sleep(10000);
		System.out.println("**");
		
	}

}
