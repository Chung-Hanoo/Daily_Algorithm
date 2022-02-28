import java.io.*;

public class Baekjoon_1065 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int count;

        if (Integer.parseInt(input) < 100) {
            count = Integer.parseInt(input);
        } else {
            count = 99;
            int[] num = new int[2];
            for (int i = 100; i <= Integer.parseInt(input); i++) {
                num[0] = i / 100 - ((i / 10) % 10);
                num[1] = ((i / 10) % 10) - i % 10;
                if (num[0] == num[1])
                    count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
