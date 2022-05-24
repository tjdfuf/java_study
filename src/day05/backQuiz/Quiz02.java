package day05.backQuiz;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        int maxNum = arr[0];
        int maxidx = 1;
        for (int i = 0; i < arr.length; i++) {
            if(maxNum < arr[i]) {
                maxNum = arr[i];
                maxidx = i+1;
            }
        }

        System.out.println(maxNum);
        System.out.println(maxidx);


    }
}
