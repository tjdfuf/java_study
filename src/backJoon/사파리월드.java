package backJoon;

import java.util.Scanner;

public class 사파리월드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();
        long M = sc.nextInt();

        if (N < 0) {
            N = -N;
        }
        if (M < 0) {
            M = -M;
        }
        System.out.println(N - M);
    }
}
