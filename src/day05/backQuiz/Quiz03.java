package day05.backQuiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3자리 숫자 3개를 받는다
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 숫자 3개를 곱한 값
        int abcNum = a * b *c;
        // 0 ~ 9까지 몇번 나온지를 저장해 놓을 배열
        int[] number = new int[10];

        while (true) {
            if(abcNum == 0) break;
            // 마지막 숫자가 몇번 숫자인지 구하는 반복문
            for (int j = 0; j < number.length; j++) {
                if (abcNum % 10 == j) {
                    number[j] += 1;
                }
            }
            abcNum = abcNum / 10;
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }


    }
}
