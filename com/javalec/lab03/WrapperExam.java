package com.javalec.lab03;

public class WrapperExam {

	public static void main(String[] args) {
		int i = 5;
		Integer i2 = new Integer(5);
		
		Integer i3 = 5; // int 5 가 자동으로 Integer 객체로 변환됨 -> autoboxing 이라고 함
		
		int i4 = i3.intValue();  // 원래는 i3객체의 int값을 반환하여 int 변수인 i5에 할당해야 함
		
		int i5  = i3;   // Integer 객체 i3는 i4에 자동으로 기본형으로 변환됨 -> auto unboxing이라고 함
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}

}
