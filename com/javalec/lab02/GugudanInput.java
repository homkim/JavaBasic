package com.javalec.lab02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GugudanInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input two values for gugudan: ");
		int i = 0, j = 0;
		try {
			i = sc.nextInt();
			j = sc.nextInt();
			
			System.out.printf("%d x %d is %2d", i, j, i*j );
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("구구단은 두개의 숫자를 입력합니다. 숫자를 입력하세요");
		}
		
	}

}
