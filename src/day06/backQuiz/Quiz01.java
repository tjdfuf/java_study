package day06.backQuiz;

import java.util.Scanner;

public class Quiz01 {

    long sum(long[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}
