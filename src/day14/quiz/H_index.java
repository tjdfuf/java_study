package day14.quiz;

import java.util.Arrays;

public class H_index {
    public int solution(int[] citations) {
        int answer = 0;

        // 인용횟수 배열 정렬
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i){
                return citations.length - i;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] a = {3, 0, 6, 1, 5};
        new H_index().solution(a);
    }
}
