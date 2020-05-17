package com.lec.java.basic;

import java.util.Random;

/**
 * Math.random(), Random()
 * @author sds
 *
 */
public class lab23_1_Random {
	public static void main(String[] args) {
		double d = Math.random();
		System.out.println(d);
		
		int di = (int) (d * 10);
		System.out.println(di);
		
		Random r1 = new Random();
		System.out.println( r1.nextInt(100) );
		
		
	}

}
