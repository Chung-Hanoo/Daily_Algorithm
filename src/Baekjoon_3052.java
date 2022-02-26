import java.io.*;
import java.util.*;

public class Baekjoon_3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> remain = new Stack<>();
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int data = Integer.parseInt(br.readLine());
            data = data % 42;
            if (!remain.contains(data)){
                count++;
                remain.push(data);
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
