package datastructure.chap06.insertion;

import java.util.Arrays;
import java.util.Scanner;

public class 삽입정렬_문제01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = i+1;
        }


        int[] time = new int[N];
        for (int i = 0; i < N; i++) {
            time[i] = sc.nextInt();
        }

        // time을 정렬

        for (int i = 1; i < time.length; i++) {
            int temp = time[i];

            int j = i;

            while (j > 0 && time[j-1] >= temp) {
                time[j] = time[j - 1];
                j--;
            }
            time[j] = temp;
        }
        int[] arr = new int[N];
        int a = 0;
        // 1 2 3 3 4
        for (int i = 0; i < time.length; i++) {
            arr[i] = a + time[i];
            a += time[i];
            // 0 += 0 + 1
            // 1 += 1 + 2
            // 4 += 4 + 3
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(time));
//        System.out.println(total);
    }
}
