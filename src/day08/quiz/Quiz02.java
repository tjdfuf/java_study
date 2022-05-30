package day08.quiz;

public class Quiz02 {
    public static boolean solution(int x) {
        boolean answer = true;

        // 원래의 값
        int z = x;
        // 각 자리의 합을 담을 변수
        int y = 0;
        // 각 자리 수의 합 구하기
        while (z > 0) {
            y += z % 10;
            z = z / 10;
//            if (z % 10 == 0) break;
        }

        if(x % y != 0) {
            answer = false;
        }

        return answer;
    }



    public static void main(String[] args) {

        System.out.println(solution(10));

    }
}
