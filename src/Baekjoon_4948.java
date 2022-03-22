import java.io.*;
import java.util.*;

public class Baekjoon_4948 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        do {
            int num_count = 0;
            for (int i = num + 1; i <= num * 2; i++) {
                if (isPrime(i))
                    num_count++;
            }
            bw.write(num_count + "\n");
            num = Integer.parseInt(br.readLine());
        } while (num != 0);
        bw.flush();
        bw.close();
    }

    // 소수 판별 함수
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
