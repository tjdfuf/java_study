package day03.forQuiz;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = "";
        for (int i = 1; i <= n; i++) {
            a += "*";
            System.out.println(a);
        }

    }
}
