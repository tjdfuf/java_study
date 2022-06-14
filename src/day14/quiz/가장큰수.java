package day14.quiz;

public class 가장큰수 {
    public static String solution(int[] numbers) {
        String answer = "";

        int[] num = numbers;

        for (int i = 0; i < num.length; i++) {
            answer += num[i];
        }
        for (int i = 1; i < answer.length(); i++) {
            // 삽입할 항목 빼놓기



        }


        return answer;
    }

    public static void main(String[] args) {
        int[] num = {6, 10, 2};
        System.out.println(solution(num));

    }
}
