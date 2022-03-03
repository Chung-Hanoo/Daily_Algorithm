import java.io.*;

public class Baekjoon_2292 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double max = Double.parseDouble(br.readLine());
        int room_line = 1;
        int grow = 1;

        while (grow < max) {
            grow = grow + (room_line * 6);
            room_line++;
        }

        bw.write(String.valueOf(room_line));
        bw.flush();
        bw.close();
    }
}
