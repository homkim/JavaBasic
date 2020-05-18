package com.javalec.lab01;

import java.util.Calendar;

public class ex22_5_Calendar {

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		
		int year = c1.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c1.get(Calendar.MONTH);
		System.out.println(month + 1);
		
		int day = c1.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		int date = c1.get(Calendar.DATE);
		System.out.println(date);

		int hour = c1.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		int minute = c1.get(Calendar.MINUTE);
		System.out.println(minute);
		int second = c1.get(Calendar.SECOND);
		System.out.println(second);

		
	}
}
