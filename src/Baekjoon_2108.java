import java.io.*;

public class Baekjoon_2108 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        double avg = 0;
        int mostCount = 0;
        int most = 0;
        boolean flag = false;

        int[] arr = new int[N];

        // Counting Sort
        int[] count = new int[8001];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            avg += arr[i];
            count[4000 + arr[i]]++;
        }

        for (int i = 0, j = 0; i < 8001; i++) {
            if (mostCount < count[i]) {
                mostCount = count[i];
                most = i - 4000;
                flag = true;
            } else if (mostCount == count[i] && flag) {
                most = i - 4000;
                flag = false;
            }
            for (int k = 0; k < count[i]; k++) {
                arr[j] = i - 4000;
                j++;
            }

        }

        bw.write(String.valueOf((int) Math.round(avg / N)) + '\n');
        bw.write(String.valueOf(arr[((N - 1) / 2)]) + '\n');
        bw.write(String.valueOf(most) + '\n');
        bw.write(String.valueOf(arr[N - 1] - arr[0]));
        bw.flush();
        bw.close();
    }
}
