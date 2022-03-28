import java.io.*;

public class Baekjoon_3053 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double r = Double.parseDouble(br.readLine());

        double euclid = r * r * Math.PI;
        double taxi = 2 * r * r;

        bw.write(String.format("%.6f", euclid) + "\n" + String.format("%.6f", taxi));
        bw.flush();
        bw.close();
    }
}
