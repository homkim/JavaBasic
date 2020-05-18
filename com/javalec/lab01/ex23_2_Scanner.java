package com.javalec.lab01;

import java.util.Scanner;

public class ex23_2_Scanner {
	public static void main(String[] args) {
		
		System.out.print("input int value: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i);
		
		System.out.print("input s1 value: ");
		String s1 = sc.next();
		System.out.println(s1);
		
		System.out.print("input s2 value: ");
		String s2 = sc.nextLine();  // 앞에서 s1이 개행전까지만 읽고 뒤로 넘겨 줌 
		System.out.println(s2);
		
		System.out.println("Finished!!");
	}
}
