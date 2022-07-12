import java.io.*;

public class Baekjoon_1436 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int seq = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 666;

        while (count != seq) {
            if (String.valueOf(num).contains("666"))
                count++;
            num++;
        }
        bw.write(String.valueOf(num - 1));
        bw.flush();
        bw.close();
    }
}
