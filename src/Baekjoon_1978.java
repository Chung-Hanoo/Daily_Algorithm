import java.io.*;
import java.util.*;

public class Baekjoon_1978 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] data = new int[count + 1];
        int prime_count = 0;

        for (int i = 0; i < count; i++) {
            data[i] = Integer.parseInt(st.nextToken());
            if (isPrime(data[i]))
                prime_count++;
        }

        bw.write(String.valueOf(prime_count));
        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
