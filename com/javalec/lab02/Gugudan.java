package com.javalec.lab02;

public class Gugudan {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (i == 0)
					System.out.printf("%d 단\t\t",j);
				else
					System.out.printf("%d x %d = %2d\t",j,i,j*i);
			}
			System.out.println("");
			
		}
	}
}
