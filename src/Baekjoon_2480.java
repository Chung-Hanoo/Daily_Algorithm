import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_2480 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] dice = new int[3];
        int same = 0;
        int money;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            dice[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(dice);
        if (dice[0] == dice[1] && dice[0] == dice[2])
            money = dice[0] * 1000 + 10000;
        else if (dice[0] == dice[1])
            money = dice[0] * 100 + 1000;
        else if (dice[1] == dice[2])
            money = dice[1] * 100 + 1000;
        else
            money = dice[2] * 100;

        bw.write(String.valueOf(money));
        bw.flush();
        bw.close();
    }
}
