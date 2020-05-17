package com.javalec.lab02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class GugudanInputLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input two int values: ");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str);
		int i = Integer.parseInt(st.nextToken());
		int j = Integer.parseInt(st.nextToken());
		
		System.out.printf("%d x %d is %2d",i, j, i*j);
		
	}
}
