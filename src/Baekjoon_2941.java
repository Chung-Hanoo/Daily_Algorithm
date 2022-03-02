import java.io.*;

public class Baekjoon_2941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] croatia_alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String data = br.readLine();

        for (int i = 0; i < 8; i++) {
            data = data.replace(croatia_alphabet[i], "0");
        }

        bw.write(String.valueOf(data.length()));
        bw.flush();
        bw.close();
    }
}
