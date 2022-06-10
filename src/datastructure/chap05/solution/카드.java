package datastructure.chap05.solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드 {

    public static void main(String[] args) {

        Queue<Integer> que = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            que.add(i);
        }
//        System.out.println(que.toString());

        while (que.size() > 1) {
//            System.out.println(que.toString());
            que.poll();
            // 두번째 숫자 맨뒤로 추가
            que.add(que.poll());
//            System.out.println(que.toString());
        }
        System.out.println(que.peek());
    }
}
