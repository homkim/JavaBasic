package com.javalec.lab01;

public class lab22_6_StringPerformance {
	public static void main(String[] args) {

		int maxCount = 10000;

		long startTime1 = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < maxCount; i++)
			str += "*";
		long endTime1 = System.currentTimeMillis();

		long startTime2 = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < maxCount; i++)
			sb.append("*");
		long endTime2 = System.currentTimeMillis();

		long startTime3 = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("");
		for (int i = 0; i < maxCount; i++)
			sb2.append("*");
		long endTime3 = System.currentTimeMillis();

		System.out.println("String + opr is " + (endTime1 - startTime1));
		System.out.println("StringBuffer is " + (endTime2 - startTime2));
		System.out.println("StringBuilderis " + (endTime3 - startTime3));

	}
}
