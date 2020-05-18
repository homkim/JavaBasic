package com.javalec.lab02;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {


		Calendar c2 = Calendar.getInstance(); 
		int year = c2.get(Calendar.YEAR);
		int month = c2.get(Calendar.MONTH) + 1;
		int date = c2.get(Calendar.DATE);
		
		c2.set(year, month - 4, 1);

		System.out.printf("Today: %d-%d-%d\n\n",year,month,date);

		int firstDayWeek = c2.get(Calendar.DAY_OF_WEEK);
		int lastDate =c2.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println(firstDayWeek);
//		System.out.println(lastDate);
		
		
		System.out.printf("%d년 %d월\n",c2.get(Calendar.YEAR), c2.get(Calendar.MONTH)+1 );
		System.out.println("일  월  화  수  목  금  토");
		for(int i=1; i< firstDayWeek + lastDate;i++) {
			if(i< firstDayWeek)
				System.out.printf("    ");
			else
				System.out.printf("%2d  ",i - firstDayWeek + 1);
			
			if(i%7 == 0) System.out.println("");
			
		}
		
		
		
		
		
		

	}

}

