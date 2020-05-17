package com.javalec.lab01;

import java.util.StringTokenizer;

public class lab24_StringTokenizer {
	public static void main(String[] args) {
		String str1 = "오늘 날씨는 춥고 눈이 많이 오고 있습니다.";
		String str2 = "2020/05/16";
		System.out.println(str1);
		System.out.println(str2);
		
		StringTokenizer st1 = new StringTokenizer(str1);
		StringTokenizer st2 = new StringTokenizer(str2, "/");
		
		System.out.println("tokenizer1 문자열 수: " + st1.countTokens());
		System.out.println("tokenizer2 문자열 수: " + st2.countTokens());
		
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken());
		
		while(st2.hasMoreTokens())
			System.out.println(st2.nextToken());
		
	}
}
