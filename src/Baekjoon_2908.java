import java.io.*;

public class Baekjoon_2908 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] data = input.split(" ");

        String strange1 = data[0].charAt(2) + String.valueOf(data[0].charAt(1)) + data[0].charAt(0);
        String strange2 = data[1].charAt(2) + String.valueOf(data[1].charAt(1)) + data[1].charAt(0);

        switch (Integer.compare(Integer.parseInt(strange1), Integer.parseInt(strange2))) {
            case 1:
                bw.write(strange1);
                break;
            case -1:
                bw.write(strange2);
                break;
        }
        bw.flush();
        bw.close();
    }
}
