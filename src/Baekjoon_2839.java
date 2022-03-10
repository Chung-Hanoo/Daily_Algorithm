import java.io.*;

public class Baekjoon_2839 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int kg = Integer.parseInt(br.readLine());
        int count = 0;

        while (kg > 0) {
            if (kg % 5 == 0) {
                kg -= 5;
                count++;
            } else if (kg % 3 == 0) {
                kg -= 3;
                count++;
            } else if (kg < 3 || kg == 4) {
                count = -1;
                break;
            } else {
                kg -= 5;
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
