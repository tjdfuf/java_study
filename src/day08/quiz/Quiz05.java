package day08.quiz;

public class Quiz05 {
    public static String solution(int a, int b) {
        String answer = "";

        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WEN"};
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int y = 0;
        for (int i = 0; i < a; i++) {
            y += month[i];
        }
//        System.out.println(y);
        int x = (y+b) % 7;
//        System.out.println(x);

        for (int i = 0; i < week.length; i++) {
            if (x == i) {
                answer = week[i];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(1, 1));
    }
}
