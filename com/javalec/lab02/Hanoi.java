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
			hanoi(n-1, a, c, b);                    // n-1개를        a-> c로 옮기는데 b는 보조한다.
			System.out.printf("%2d: %c->%c  ",++cnt, a,b);	// n번째 원판은 a -> b로 옮긴다.
			if(cnt%7==0) System.out.println("");
			hanoi(n-1, c, b, a);                    // 마지막으로 c에 있던 n-1개를  b로 옮기는데 a가 보조한다.			
		}
	}

}
