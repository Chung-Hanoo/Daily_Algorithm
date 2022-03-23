import java.io.*;

public class Baekjoon_9020 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test_count = Integer.parseInt(br.readLine());
        for (int i = 0; i < test_count; i++) {
            int test = Integer.parseInt(br.readLine());
            int half = test / 2;
            for (int j = 0; j < half; j++) {
                if (isPrime(half - j) && isPrime(half + j)) {
                    bw.write((half - j) + " " + (half + j) + "\n");
                    break;
                }
            }
        }

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
