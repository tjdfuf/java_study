package day03.forQuiz;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0;
        for (int i = 1; i <= n; i++) {
            a += i;
        }
        System.out.println(a);
    }
}
