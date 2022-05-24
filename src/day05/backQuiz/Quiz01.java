package day05.backQuiz;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열 길이 받기
        int width = sc.nextInt();
        int[] numbers = {};

        // 받은 수만큼의 배열 만들기
        int[] temp = new int[numbers.length+width];
        // 배열에 넣을 수 받기
        for (int i = 0; i < width; i++) {
            int inputNum = sc.nextInt();
            temp[i] = inputNum;
//            System.out.printf("%d ", inputNum);
        }
        numbers = temp;
        temp = null;
//        System.out.println(Arrays.toString(numbers));
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.printf("%d ", numbers[i]);
//        }

        // 최솟값과 최대값 비교하며 넣기
        int maxNum = numbers[0];
        int minNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
        }


//        System.out.println("입력 후: " + Arrays.toString(numbers));
//        System.out.println("최대값: " + maxNum);
//        System.out.println("최소값: " + minNum);
        System.out.printf("%d %d", minNum, maxNum);


    }
}
