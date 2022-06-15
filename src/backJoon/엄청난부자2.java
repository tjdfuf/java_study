package backJoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 엄청난부자2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();


        String[] b = a.split(" ");

        long[] c = new long[b.length];

        for (int i = 0; i < c.length; i++) {
            c[i] = Long.parseLong(b[i]);
        }
        Long n = c[0];
        Long m = c[1];
        /*
        StringTokenizer st = new StringTokenizer(a, " ");

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
//        System.out.println(Arrays.toString(c));
//        long n = st.nextToken() + " ";
//        long m = c[1];
         */

        System.out.println(n / m);
        System.out.println(n % m);


    }
}
