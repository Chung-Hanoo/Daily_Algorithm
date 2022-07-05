import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_7568 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        int[][] data = new int[count][3];
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            data[i][0] = Integer.parseInt(st.nextToken());
            data[i][1] = Integer.parseInt(st.nextToken());
            data[i][2] = 1;
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (data[i][0] < data[j][0] && data[i][1] < data[j][1] && i != j)
                    data[i][2]++;
            }
        }

        for (int i = 0; i < count; i++)
            bw.write(data[i][2] + " ");

        bw.flush();
        bw.close();
    }
}
