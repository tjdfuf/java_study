package day18.api.io.buffer;

import java.io.*;
import java.util.StringTokenizer;

public class BufferedReaderExample {

    public static void main(String[] args) {

        // Buffered~~ 는 보조 스트림이므로 핵심기능을 하는 스트림과 결합해야합니다.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String x = st.nextToken();
            System.out.println(s);
            System.out.println(x);
//            int x = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());

//            System.out.println(x + y);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
