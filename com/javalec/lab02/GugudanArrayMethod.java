package com.javalec.lab02;

public class GugudanArrayMethod {
    public static int[] calculate(int times) {
        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            // 계산 결과를 배열에 저장
        	result[i] = (i+1) * times;
        }

        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            // 계산 결과를 화면에 출력
        	System.out.printf("%d\n",result[i]);
        }
    }

    public static void main(String[] args) {

        for (int j = 2; j < 10; j++) {
            // calculate와 print 메소드 활용해 구구단 구현하기
        	int[] res = calculate(j);
        	print(res);
        	
        }
    }
}
