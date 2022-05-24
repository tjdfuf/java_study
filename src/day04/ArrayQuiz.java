package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dong = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println(" * 우리반 학생들의 별명: " + Arrays.toString(dong));


        int idx = -1;
        while (true) {
            // 삭제할 학생 입력받기
            System.out.println(" - 삭제할 학생의 별명을 입력하세요!");
            System.out.printf("> ");
            String name = sc.next();

            // 삭제할 학생의 인덱스 찾기
            for (int i = 0; i < dong.length; i++) {
                if(name.equals(dong[i])) {
                    idx = i;
                    break;
                }
            }
            // 삭제할 학생 유무 확인
            boolean hasName = idx != -1;
            // 삭제할 학생이 없다면 나올 화면
            if (!hasName) {
                System.out.println("해당 별명(" + name +")은 존재하지 않습니다.");
            }
            // 삭제할 학생이 있다면 삭제하기
            else {
                // 삭제할 학생 이후를 앞으로 한칸씩 당기기
                for (int i = idx; i < dong.length-1; i++) {
                    dong[i] = dong[i+1];
                }
                // dong.length-1 배열을 만들고 넣기
                String[] temp = new String[dong.length-1];
                for (int i = 0; i < dong.length-1; i++) {
                    temp[i] = dong[i];
                }
                dong = temp;
                temp = null;

                System.out.println(name + "의 별명을 삭제합니다.");
                System.out.println(" * 삭제 후 정보: " + Arrays.toString(dong));
                break;
            }

        }



    }
}
