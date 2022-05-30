package day08.quiz;

public class Quiz06 {
    public static int solution(int[] numbers) {
        int answer = -1;
        long total = 45;
        for (int i = 0; i < numbers.length; i++) {
            total -= numbers[i];
        }
        answer = (int)total;
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {5,8,4,0,6,7,9};
        System.out.println(solution(nums));
    }
}
