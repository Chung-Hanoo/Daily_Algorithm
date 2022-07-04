import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_2798 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] list = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(blackJack(N, M, list));
        bw.flush();
        bw.close();
    }

    public static String blackJack(int N, int M, int[] list) {
        Arrays.sort(list);
        int smallest = list[0] + list[1];
        int range = N;

        // 가장 큰 숫자는 M - (1, 2번째로 작은 숫자의 합)보다 작아야함
        for (int i = 2; i < N; i++) {
            if (list[i] > M - smallest) {
                range = i;
                break;
            }
        }

        int similar = 0;
        for (int i = 0; i < range - 2; i++) {
            // 정렬된 list 에서 i 번재와 i+1 번째의 숫자 합이 M보다 클 경우 break;
            if (M < list[i] + list[i + 1])
                break;

            for (int j = i + 1; j < range - 1; j++) {
                // 정렬된 list 에서 i 번재와 j번째, j+1 번째의 숫자 합이 M보다 클 경우 break;
                if (M < list[i] + list[j] + list[j + 1])
                    break;

                for (int k = j + 1; k < range; k++) {
                    if (M < list[i] + list[j] + list[k])
                        break;

                    if (similar < list[i] + list[j] + list[k])
                        similar = list[i] + list[j] + list[k];
                }

            }
        }

        return String.valueOf(similar);
    }
}