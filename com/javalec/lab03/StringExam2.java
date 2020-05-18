package com.javalec.lab03;

public class StringExam2 {

	public static void main(String[] args) {
		String str1 = "hello world";
		String str2 = str1.substring(5);

		System.out.println(str1);
		System.out.println(str2);

		String str3 = str1 + str2; // String str3 = new
									// StringBuffer().append(str1).append(str2).toString()
		System.out.println(str3);
		
		// + 연산을 반복문에서 사용하게 되면 new 연산자가 계속해서 생성되어 퍼포먼스 악영향
		// 자바 프로그램은 new 연산자를 많이 사용할수록 느려짐
		long stime1 = System.currentTimeMillis();
		String str4 = "";
		for (int i = 0; i < 1000; i++) {
			str4 += "*";
		}
		long ttime1 = System.currentTimeMillis();


		// StringBuffer의 append 기능을 활용하는 것이 훨씬 효과적임
		long stime2 = System.currentTimeMillis();
		String str5 = "";
		StringBuffer sb5 = new StringBuffer();
		for (int i = 0; i < 1000; i++) {
			sb5.append("*");
			
		}
		str5 = sb5.toString();
		long ttime2 = System.currentTimeMillis();
		
		long d1 = ttime1 - stime1;
		long d2 = ttime2 - stime2;
		
		System.out.println(str4);
		System.out.println(d1);
		
		System.out.println(str5);
		System.out.println(d2);

	}

}
