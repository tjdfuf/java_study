package day08.quiz;

public class Quiz04 {
    public static long solution(int price, int money, int count) {
        long answer = -1;
        // count번 탈 때 필요한 price 구하기
        long a = 0;
        for (int i = 1; i <= count; i++) {
            a += price * i;
        }
        System.out.println(a);
        answer = a - money;
        if (answer < 0) {
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}
