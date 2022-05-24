package day03;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 가로로 출력하는 코드
        int n = 10;
        int i = 1;

        while (i <= n) {
            System.out.printf("%d ", i);
            i++;
        }

    }
}
