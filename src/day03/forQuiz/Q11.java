package day03.forQuiz;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), X = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int a = sc.nextInt();
            if (a < X) {
                System.out.printf("%d ", a);
            }
        }

    }
}
