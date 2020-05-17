package com.javalec.lab02;

public class GugudanArray {
	public static void main(String[] args) {
		int[] result = new int[9];
		int dan = 4;
		
		for (int i = 0; i < result.length; i++) {
			result[i] = dan * (i+1);
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%d x %d = %2d\n", dan, i + 1, result[i]);
			
		}
	}
}
