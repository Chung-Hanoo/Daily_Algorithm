import java.io.*;

public class Baekjoon_1152 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] words = br.readLine().split(" ");

        int count = words.length;
        if (words.length > 0 && words[0].equals(""))
            count--;
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
