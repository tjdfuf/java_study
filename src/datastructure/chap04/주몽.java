package datastructure.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class 주몽 {
    /*
        1. 오름차 정렬 - Arrays.sort(배열변수)
        2. s 를 첫위치 e를 끝위치에 둔다
        3. 찾는 수보다 합산 수가 작은 경우
           s를 오른쪽으로 한칸 이동
        4. 찾는 수보다 합산 수가 큰 경우
           e를 왼쪽으로 한칸 이동
        5. 찾는 수와 합산 수가 같은 경우
           count를 증가시키고 s++ , e--

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int s = 0;
        int e = arr.length-1;
        int M = sc.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] += sc.nextInt();
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int count = 0;
        while (s < e) {
            int total = arr[s] + arr[e];
            if(M > total) {
                s++;
            }else if (M < total) {
                e--;
            } else {
                count++;
                s++;
                e--;
            }
        }
        System.out.println(count);
    }

}
