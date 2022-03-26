import java.io.*;
import java.util.*;
import java.math.*;

public class Baekjoon_4153 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a < b) {
                int i = a;
                a = b;
                b = i;
            }
            int c = Integer.parseInt(st.nextToken());
            if (a < c) {
                int i = a;
                a = c;
                c = i;
            }
            if (a == 0 && b == 0 && c == 0)
                break;
            if (Math.pow(a, 2) == Math.pow(b,2)+Math.pow(c,2))
                bw.write("right\n");
            else
                bw.write("wrong\n");
        }

        bw.flush();
        bw.close();
    }
}
