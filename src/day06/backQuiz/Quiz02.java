package day06.backQuiz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Quiz02 {

    static void selfNum() {
        int[] arr = new int[10000];
        // 1 ~ 10000까지 배열에 넣기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
//        int[] arr2 = new int[arr.length];
        // 셀프넘버가 아닌것 찾기
        while (true) {
            int x = 0;
            x++;
            int y = x;
            while (true) {

                y += x % 10;
                x = x / 10;
                if (x == 0) break;
            }
//                arr2[i] = y;
//                System.out.println(Arrays.toString(arr2));
            // 1 ~ 10000까지중 셀프넘버가 아닌것을 빼기
            int index = -1;
            for (int t = 0; t < arr.length; t++) {
                if (arr[t] == y) {
                    index = t;
                }
            }
            if (index == -1) break;
            for (int t = index; t < arr.length - 1; t++) {
                arr[t] = arr[t + 1];
            }
            int[] temp = new int[arr.length - 1];
            for (int t = 0; t < temp.length; t++) {
                temp[t] = arr[t];
            }
            arr = temp;
            temp = null;

        }


        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        selfNum();
    }
}
