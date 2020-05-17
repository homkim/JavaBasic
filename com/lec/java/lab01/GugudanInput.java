package com.lec.java.lab01;

import java.util.Scanner;

public class GugudanInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input two values for gugudan: ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.printf("%d x %d is %2d",i,j,i*j);
	}

}
