import java.io.*;

public class Baekjoon_1193 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int end = 0;
        int line = 0;

        while (num > end) {
            line++;
            end += line;
        }

        if (line % 2 == 0) { // 사선 라인 짝수
            bw.write(String.valueOf(line - end + num) + "/" + String.valueOf(end - num + 1));
        } else { //사선 라인 홀수
            bw.write(String.valueOf(end - num + 1) + "/" + String.valueOf(line - end + num));
        }
        bw.flush();
        bw.close();
    }
}
