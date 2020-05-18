package com.javalec.lab03;

public class MathExam {

	public static void main(String[] args) {
		
		// Math 클래스 자체가 private 으로 선언되어 있어 객체를 생성하지 못함 
		// 대신에 모든 field와  함수가 static으로 선언되어 별도로 객체 생성 없이 사용가능함
        int value1 = Math.max(5, 30);
        System.out.println("max: " + value1);
        int value2 = Math.min(5, 30);
        System.out.println("min: " + value2);
        int value3 = Math.abs(-10);
        System.out.println("abs: " + value3);
        double value4 = Math.random(); // 0 ~ 1.00 double type
        System.out.println("Math.random(): " + value4);
        double value5 = Math.sqrt(25);  
        System.out.println("sqrt(25): " + value5);
        
	}

}
