package day03.forQuiz;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String a = "";
            for (int w = n-1; w >= 0; w--) {
                if (i <= w) {
                    a += " ";
                } else {
                    a += "*";
                }
            }
            System.out.println(a);
        }

    }
}
