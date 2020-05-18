package com.javalec.lab01;

import java.util.Timer;

public class ex24_1_TimerEx {

	public ex24_1_TimerEx() throws InterruptedException {
		// TODO Auto-generated constructor stub
		System.out.println("^^");
		Timer timer = new Timer(true);
		ex24_1_TimerTask1 t1 = new ex24_1_TimerTask1();
		ex24_1_TimerTask2 t2 = new ex24_1_TimerTask2();
		
		timer.schedule(t1, 2000);
		timer.schedule(t2, 7000);
		
		Thread.sleep(10000);
		System.out.println("**");
		
	}

}
