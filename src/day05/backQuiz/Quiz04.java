package day05.backQuiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자 10개를 저장 해놓을 배열
        int[] numbers = new int[10];
        // %42의 값을 저장 해놓을 배열
        int[] rest = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        // 숫자 10개를 받아 배열에 저장한다
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += sc.nextInt();
        }

        // 숫자 10개 % 42의 값을 배열에 저장한다 단, 같은값이 있으면 저장하지 않는다.
        for (int i = 0; i < numbers.length; i++) {
            int idx = -1;
//            System.out.println(idx);
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] % 42 == rest[j]) {
                    idx = -1;
                    break;
                } else {
                    idx = i;
                }
//                if (numbers[i] % 42 != rest[j]) {
//                    idx = i;
//                } else {
//                    break;
//                }
            }
//            System.out.println(idx);
            boolean hasNum = idx != -1;
//            System.out.println(hasNum);
            if (hasNum) {
                rest[i] = numbers[i] % 42;
            }
//            System.out.println(Arrays.toString(rest));
        }
//        System.out.println(Arrays.toString(rest));
        int count = 0;
        for(int i : rest) {
            if(i != -1) {
                count++;
            }
        }

        System.out.println(count);

//        System.out.println(Arrays.toString(rest));


//        int standard = numbers[0] % 42;
//        int count = 1;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 42 != standard) {
//                count++;
//
//            }
//            for (int t = i+1; t < numbers.length; t++) {
//                if(numbers[i] % 42 == numbers[t] % 42) {
//                    count--;
//                }
//            }
//        }
//        System.out.println(count);





    }
}
