package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("게임 인원 (2 ~ 4명) ==> ");
        int persons = sc.nextInt();

        String[] nickName = new String[persons];

        System.out.println("플레이어 이름을 등록합니다.");
        for (int i = 1; i <= persons; i++) {
            System.out.print(i + "번 플레이어 이름 : ");
            nickName[i-1] = sc.next();
        }
        System.out.println(Arrays.toString(nickName) + " 참가!");

        System.out.print("실탄 개수(1 ~ 5개) ==> ");
        int bullet = sc.nextInt();
        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");
        int[] gun = new int[6];

        for (int i = 0; i < bullet; i++) {

        }



    }
}
