package com.lec.java.basic;

public class lab23_3_Wrapper {
	/**
	 * 기초데이터를 객체데이터로 변환해주는 클래스를 말한다. byte, short, int, long, double, float, boolean,
	 * char(Character) 8개
	 */
	public static void main(String[] args) {
		Integer i1 = new Integer(10); // 기초데이터 10을 객체데이터로 변환해주는 클래스
		int i2 = i1.intValue();
		System.out.println(i2);
		
		String str = "12345";
		int i3 = Integer.parseInt(str);
		System.out.println(i3);
	}
}
