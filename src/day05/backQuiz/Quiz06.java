package day05.backQuiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 몇개의 문제를 받을지
        int quizNum = sc.nextInt();
        // 문제 저장 배열
        String[] quiz = new String[quizNum];
        // 점수 저장 배열
        int[] quizScore = new int[quizNum];

        // 문제 받기
        for (int i = 0; i < quizNum; i++) {
            quiz[i] = sc.next();
        }

        for (int t = 0; t < quiz.length; t++) {
            int score = 0;
            int count = 0;
            for (int i = 0; i < quiz[t].length(); i++) {
                if(quiz[t].charAt(i) == 'O') {
                    count++;
                    score += count;
                } else {
                    count = 0;
                }
            }
//            System.out.println(score);
            quizScore[t] = score;
        }


//        System.out.println(Arrays.toString(quizScore));
        for (int i = 0; i < quizScore.length; i++) {
            System.out.println(quizScore[i]);
        }


    }
}
