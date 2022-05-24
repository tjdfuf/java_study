package day05.backQuiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        double[] score = new double[number];
        double maxNum = 0;
        double[] newScore = new double[number];

        // 점수 배열에 넣기
        for (int i = 0; i < number; i++) {
            score[i] += sc.nextInt();
        }

        // 최대값 찾기
        for (double i : score) {
            if(i > maxNum) {
                maxNum = i;
            }
        }
//        System.out.println(maxNum);
        for (int i = 0; i < score.length; i++) {
            newScore[i] = score[i] / maxNum * 100;
        }
//        System.out.println(Arrays.toString(score));
//
//        System.out.println(Arrays.toString(newScore));
        double allScore = 0;
        for(double i : newScore) {
            allScore += i;
        }
        double average = allScore / number;

        System.out.println(average);
    }
}
