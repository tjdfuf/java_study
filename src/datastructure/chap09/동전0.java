package datastructure.chap09;

import java.util.Scanner;

public class 동전0 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[N];
        int a = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= k) {
                a += k / arr[i];
                k = k % arr[i];
            }
            if (k == 0) break;
        }

        System.out.println(a);


    }
}
