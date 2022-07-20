import java.io.*;

public class Baekjoon_1427 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        int[] count = new int[10];

        for (int i = 0; i < num.length(); i++) {
            int tmp = Integer.parseInt(num.substring(i, i + 1));
            count[tmp]++;
        }
        for (int i = 9; i >= 0; i--) {
            for (int k = 0; k < count[i]; k++) {
                bw.write(String.valueOf(i));
            }
        }
        bw.flush();
        bw.close();
    }
}
