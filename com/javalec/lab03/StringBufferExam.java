package com.javalec.lab03;

public class StringBufferExam {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");  
		if(sb2==sb3) // 참조형 변수가 동일한 값을 참조하므로 같은 객체라고 할 수 있음
			System.out.println("sb2 == sb3");
		
		// 자신의 함수를 자신의 함수타입으로 리턴하여 연결해 나가는 것을 메소드 체이닝이라고 함
		String str2 = new StringBuffer().append("Hello").append(" ").append("World").toString();
		System.out.println(str2);
		
	}

}
