package day03;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        apple: for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                if(lower == 'f') break apple;
                System.out.printf("%c - %c\n", upper, lower);
            } // inner for
//            if (upper == 'D') break;
        } // outer for
    }
}
