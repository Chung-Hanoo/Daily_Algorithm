import java.io.*;

public class Baekjoon_10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] countSum = new int[10001];

        // Counting Sort 사용
        for (int i = 0; i < count; i++) {
            countSum[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 0; i < 10001; i++) {
            int countEach = countSum[i];
            for (int j = 0; j < countEach; j++) {
                bw.write(String.valueOf(i) + '\n');
            }
        }
        bw.flush();
        bw.close();
    }
}
