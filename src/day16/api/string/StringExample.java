package day16.api.string;

import utility.Util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringExample {

    public static void main(String[] args) {

//        String s = "라면 떡볶이 보쌈 짜장면";
        String s = "1 2 3 4";
        // 문자열 쪼개기
        // 공백을 기준으로 나눠서 배열에 넣어서 줌
        String[] sArr = s.split(" ");
        int[] numbers = new int[sArr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(sArr[i]);
        }
        System.out.println(Arrays.toString(numbers));

        Util.line();

        // 문자열 쪼개기 - 2번
        s = "짜장면,탕수육,볶음밥,라면,김밥";
        StringTokenizer st = new StringTokenizer(s, ",");

        String[] foods = new String[st.countTokens()];

//        System.out.println(st.countTokens());
        for (int i = 0; st.hasMoreTokens(); i++) {
            foods[i] = st.nextToken();
        }
        System.out.println(foods.length);
        System.out.println(Arrays.toString(foods));

        long ss = System.currentTimeMillis();
        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
//            str += (i+1);
//            sb.append(i+1);
        }
        long ee = System.currentTimeMillis();
        System.out.println((ee - ss) + "ms");



    }
}
