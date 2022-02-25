import java.io.*;

public class Baekjoon_2577 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[10];
        double[] input = new double[3];
        double total = 1;

        for (int i = 0; i < 3; i++) {
            input[i] = Double.parseDouble(br.readLine());
            total *= input[i];
        }

        while (total >= 10) {
            int temp = (int) (total % 10);
            num[temp]++;
            total = Math.floor(total / 10);
        }
        num[((int) total)]++;

        for (int i = 0; i < 10; i++) {
            bw.write(String.valueOf(num[i]) + '\n');
            bw.flush();
        }
        bw.close();
    }
}
