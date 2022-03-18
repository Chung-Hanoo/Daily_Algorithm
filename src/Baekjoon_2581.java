import java.io.*;

public class Baekjoon_2581 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int M_primes_sum = 0; // M까지 소수 합
        int N_primes_sum = 0; // N까지 소수 합
        int N_primes_min = -1; // M과 N 사이에 존재하는 소수 중 가장 작은 소수

        for (int i = 1; i <= N; i++) {
            if (isPrime(i)) {
                N_primes_sum += i;
                if (M <= i & N_primes_min == -1) {
                    N_primes_min = i;
                } else if (i < M)
                    M_primes_sum += i;

            }
        }

        if (N_primes_min == -1) {
            bw.write("-1");
        } else {
            bw.write(N_primes_sum - M_primes_sum + "\n" + N_primes_min);
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
