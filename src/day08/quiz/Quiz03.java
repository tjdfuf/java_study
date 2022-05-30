package day08.quiz;

public class Quiz03 {
    public static int solution(long num) {
        int answer = 0;
        long x = num;
        while (true) {
            if (x == 1) break;
            if (answer == 500) {
                answer = -1;
                break;
            }
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = (x * 3) + 1;
            }
            answer++;

        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}
