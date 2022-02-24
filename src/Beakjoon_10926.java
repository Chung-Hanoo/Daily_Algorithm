import java.io.*;

public class Beakjoon_10926 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 아이디 입력
        String ID = bf.readLine();

        // 출력
        bw.write(ID + "??!");
        bw.flush();
        bw.close();
    }
}