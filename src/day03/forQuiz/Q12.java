package day03.forQuiz;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt(), b = sc.nextInt();
            if(a==0 & b== 0) break;
            System.out.println(a+b);
        }

    }
}
