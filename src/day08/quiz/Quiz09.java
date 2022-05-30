package day08.quiz;

public class Quiz09 {
    public static int solution(String s) {
        String[] numberStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numberStr.length; i++) {
            s = s.replace(numberStr[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String s = "one4seveneight";

        System.out.println(solution(s));
    }
}
