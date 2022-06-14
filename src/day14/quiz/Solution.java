package day14.quiz;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = array;
        int[][] com = commands;
        int[] number = new int[com.length];
        int t = 0;
        for (int i = 0; i < com.length; i++) {
            int s = com[i][0];
            int e = com[i][1];
            int n = com[i][2];
            int a = 0;
            int[] temp = new int[e - s + 1];
            for (int j = s; j <= e; j++) {
                temp[a] = answer[j - 1];
                a++;
            }
//            System.out.println(Arrays.toString(temp));

            for (int j = 1; j < temp.length; j++) {
                int x = temp[j];
                // 2 6 3
                int y = j;

                while (y > 0 && temp[y - 1] >= x) {
                    temp[y] = temp[y - 1];
                    y--;
                }
                temp[y] = x;
            }
            if (t < com.length) {
                number[t] = temp[n - 1];
                t++;
            }
//            System.out.println(Arrays.toString(temp));
//            System.out.println(Arrays.toString(number));
        }

        return number;
    }


}
