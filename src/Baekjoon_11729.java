import java.io.*;

public class Baekjoon_11729 {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int board = Integer.parseInt(br.readLine());
        bw.write((int) (Math.pow(2, board)) - 1 + "\n");

        Hanoi(board, 1, 2, 3);
        bw.flush();
        bw.close();
    }

    public static void Hanoi(int boardCount, int start, int through, int end) throws Exception {
        if (boardCount == 1) {
            bw.write(start + " " + end + "\n");
            return;
        }
        // 맨 아래판을 옮기기 위해 boardCount - 1 개를 옮김
        Hanoi(boardCount - 1, start, end, through);
        // start 에서 end 로 가장 큰 판 1개를 옮겼기 때문에 bufferedWriter 에 추가
        bw.write(start + " " + end + "\n");
        // 가장 작은 판을 through 에서 start 로 다시 옮김
        Hanoi(boardCount - 1, through, start, end);
    }
}
