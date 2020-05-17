package com.javalec.lab02;

public class Gugudan {
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %2d\t",j,i,j*i);
			}
			System.out.println("");
			
		}
	}
}
