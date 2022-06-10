package datastructure.chap04;

import datastructure.chap02.linkedlist.doubly.Node;

import java.util.Scanner;

public class 수들의합 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt(); // 찾아야하는 부분 합
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        int start = 0; // 시작 포인터
        int end = 0; // 끝 포인터
        int M = arr[start]; // 부분합을 저장
        int count = 0; // M이 N이 되는 경우의 수

        while (end < N) {
//            System.out.printf("start: %d, end: %d, M: %d, count: %d\n"
//                    , start, end, M, count);
            if (M == N) {
                count++; // 원하는 합을 발견한 경우 경우의 수 증가
                end++;
                if(end < N) M += arr[end];
            } else if (M > N) {
                M -= arr[start];
                start++;
            } else {
                end++;
                M += arr[end];
            }
        }
//        System.out.println(count);

    }
}
