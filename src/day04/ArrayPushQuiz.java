package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] fruits = {};
        System.out.println("먹고 싶은 음식을 입력하세요!!");
        System.out.println("입력을 중지하려면 <그만>이라고 입력하세요.");

        while (true) {
            System.out.printf(">> ");
            String fruit = sc.next();
            if (fruit.equals("그만")) break;
            String[] temp = new String[fruits.length + 1];
            for (int i = 0; i < fruits.length; i++) {
                temp[i] = fruits[i];
            }

            temp[fruits.length] = fruit;

            fruits = temp;
            temp = null;
        }
        System.out.println("먹고싶은 음식 리스트: " + Arrays.toString(fruits));


        System.out.println("리스트중 제거 하고 싶은 음식을 입력하세요!!");
        System.out.println("입력을 중지하려면 <그만>이라고 입력하세요.");
        while (true) {
            System.out.printf(">> ");
            String del = sc.next();
            if (del.equals("그만")) break;
            String[] temp = new String[fruits.length - 1];
            for (int i = 0; i < fruits.length-1; i++) {
                temp[i] = fruits[i];
            }

            fruits = temp;
            temp = null;
        }
        System.out.println("먹고싶은 음식 리스트: " + Arrays.toString(fruits));
    }
}
