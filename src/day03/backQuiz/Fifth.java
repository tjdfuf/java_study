package day03.backQuiz;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M >= 45) {
                System.out.println(H);
                System.out.println(M-45);
        } else {
            if (H > 0) {
                System.out.println(H-1);
                System.out.println(M+15);
            } else {
                System.out.println(23);
                System.out.println(M+15);
            }
        }
    }
}
