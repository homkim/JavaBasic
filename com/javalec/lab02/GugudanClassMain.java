package com.javalec.lab02;

public class GugudanClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int j = 2; j < 10; j++) {
            // calculate와 print 메소드 활용해 구구단 구현하기
        	int[] res = GugudanClass.calculate(j);
        	GugudanClass.print(res);
        	
        }

	}

}
