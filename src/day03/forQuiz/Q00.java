package day03.forQuiz;

import java.util.Scanner;

public class Q00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            String a = "";
            for (int w = 1; w <= n-i; w++) {
                a += "*";
            }
            System.out.println(a);
        }
    }
}
