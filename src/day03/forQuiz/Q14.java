package day03.forQuiz;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        // 입력값
        int n = 26;

        // 두자리의 합
        int a = n/10 + n%10;
        System.out.println("a = " + a);
        // 숫자의 나머지와 합
        int b = n%10*10 + a%10;
        System.out.println("b = " + b);
        // b의 합
        int c = b/10 + b%10;
        System.out.println("c = " + c);
        // b의 나머지와 합
        int d = b%10*10 + c%10;
        System.out.println("d = " + d);

         */

        // 입력받은 두자리 수
        int n = sc.nextInt();
        // 변경 될 두자리 수
        int x = n;
        // 카운트
        int z = 0;
        while (true) {
            // 두자리의 합
            int y = (x / 10) + (x % 10);
            // 새로운 두자리 숫자로 교체
            x = (x % 10 * 10) + (y % 10);
            // 카운트 업
            z++;
            // 첫숫자와 같아지면 탈출
            if (n == x) break;
        }
        System.out.println(z);
    }
}
