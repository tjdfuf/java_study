package day04;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {

        int[] arr = {50, 150, 200, 250, 300};

        int newNumber = 100; // 신규 삽입데이터
        int targetIdx = 1; // 삽입 위치

        System.out.println("삽입 전: " + Arrays.toString(arr));

        // arr+1의 배열 만들기
        int[] temp = new int[arr.length + 1];
        // arr+1의 배열에 옮기기
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        temp = null;
        System.out.println(Arrays.toString(arr));
        // 타겟과 이후의 값을 뒤로 한칸씩 옮기기
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        // 타겟의 값을 변경하기
        arr[targetIdx] = newNumber;


        // 50, 100, 150, 200, 250, 300
        System.out.println("삽입 후: " + Arrays.toString(arr));

    }
}
