import java.io.*;

public class Baekjoon_10250 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            String[] data = br.readLine().split(" ");
            int high = Integer.parseInt(data[0]);
            int order = Integer.parseInt(data[2]);
            int room;

            if (order % high == 0) { // 층수 찾기
                room = high * 100;
                room = room + order / high;
            } else {
                room = (order % high) * 100;
                room = room + (order / high) + 1;
            }
            bw.write(String.valueOf(room));
            if (i < test - 1)
                bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
