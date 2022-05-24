package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dong = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("변경 전 정보: " + Arrays.toString(dong));


        while (true) {
            System.out.println("- 수정할 맴버의 이름을 입력하세요.");
            System.out.printf(">> ");
            String target = sc.next();

            int index = -1;
            for (int i = 0; i < dong.length; i++) {
                if (target.equals(dong[i])) {
                    index = i;
                    break;
                }
            }
//        System.out.println(index);
            boolean hasIndex = index != -1;
            if (!hasIndex) {
                System.out.println(target + "은(는) 없는 이름입니다.");
            } else {
                System.out.println(target + "의 별명을 변경합니다.");
                System.out.printf(">> ");
                String newName = sc.next();
                dong[index] = newName;
                System.out.println("변경 완료!!");
                System.out.println("변경 후 정보: " + Arrays.toString(dong));
                break;
            }
        }

    }
}
