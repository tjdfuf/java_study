package datastructure.chap09;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 잃어버린괄호 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        StringTokenizer b = new StringTokenizer(a, "-");

        String[] c = new String[b.countTokens()];

        for (int i = 0; i < c.length; i++) {
            c[i] = b.nextToken();
        }
//        System.out.println(Arrays.toString(c));
        for (int j = 0; j < c.length; j++) {
            String s = c[j];
            int x = 0;
            if (s.contains("+")) {
                StringTokenizer d = new StringTokenizer(s, "+");
                String[] e = new String[d.countTokens()];
                for (int i = 0; d.hasMoreTokens(); i++) {
                    e[i] = d.nextToken();
                }
                for (int i = 0; i < e.length; i++) {
                    x += Integer.parseInt(e[i]);
                }
//                System.out.println(Arrays.toString(e));
                c[j] = String.valueOf(x);
            }

        }
//        System.out.println(Arrays.toString(c));
        int y = Integer.parseInt(c[0]);
        for (int i = 1; i < c.length; i++) {
            y -= Integer.parseInt(c[i]);
        }
        System.out.println(y);
    }
}
