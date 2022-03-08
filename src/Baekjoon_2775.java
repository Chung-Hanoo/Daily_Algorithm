import java.io.*;

public class Baekjoon_2775 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            int floor = Integer.parseInt(br.readLine());
            int number = Integer.parseInt(br.readLine());

            int ans = peopleLive(floor, number);
            bw.write(String.valueOf(ans) + '\n');
        }
        bw.flush();
        bw.close();
    }

    public static int peopleLive(int K, int N) {
        if (K == 0)
            return N;
        else if (N == 0)
            return 0;
        else
            return peopleLive(K, N - 1) + peopleLive(K - 1, N);
    }
}