package day01;

public class Variable {
    public static void main(String[] args) {

        // 변수의 선언
        int score;

        // 변수의 초기화
        score = 70;

        System.out.println(score);

        int life;
        life = 10;
        System.out.println(life);

        double triple = score * 3;
        System.out.println("triple = " + score * 3);

        String nickname = "짹짹이";
        System.out.println("nickname = " + nickname);

//        nickname = 5.5; 변수타입과 다른 값은 저장 불가
//        double score = 3.3;
        String userName = "홍길동";
        double random = Math.random();
        // Ctrl + Alt + V

    }
}
