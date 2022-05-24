package day04;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        System.out.println("Reverse 전: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }


        System.out.println("Reverse 후: " + Arrays.toString(arr));
    }
}
