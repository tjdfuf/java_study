package day03.backQuiz;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int H = sc.nextInt(), M = sc.nextInt();
            int cooking = sc.nextInt();

            if (cooking < 60) {
                if((M + cooking) < 60) {
                    System.out.println(H);
                    System.out.println(M+cooking);
                } else {
                    if(H == 23) {
                        System.out.println(0);
                        System.out.println(M+cooking-60);
                    } else {
                        System.out.println(H+1);
                        System.out.println(M+cooking-60);
                    }
                }
            } else {
                if ((H + (M + cooking)/60) < 24) {
                    System.out.println(H + (M + cooking)/60);
                    System.out.println((M + cooking)%60);
                } else {
                    System.out.println(H + (M + cooking)/60 - 24);
                    System.out.println((M + cooking)%60);
                }
            }

    }
}
