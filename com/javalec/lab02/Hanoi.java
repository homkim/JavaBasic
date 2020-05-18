package com.javalec.lab02;

public class Hanoi {
	static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		hanoi(n,'a','b','c');
	}

	public static void hanoi(int n, char a, char b, char c) {
		if (n > 0) {
			hanoi(n-1, a, c, b);                    // n-1����        a-> c�� �ű�µ� b�� �����Ѵ�.
			System.out.printf("%2d: %c->%c  ",++cnt, a,b);	// n��° ������ a -> b�� �ű��.
			if(cnt%7==0) System.out.println("");
			hanoi(n-1, c, b, a);                    // ���������� c�� �ִ� n-1����  b�� �ű�µ� a�� �����Ѵ�.			
		}
	}

}