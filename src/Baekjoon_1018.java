import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_1018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] board = new String[N];

        // 체스판 데이터 읽기
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine();
        }

        // 처음 등장하는 문자가 W일 경우로 가정하여 count
        int min = 64;
        int count;
        // 8x8 판을 구분지어 보기 위해 제한 조건
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                count = 0;
                // 지정한 구역 내에서 8x8 확인
                for (int k = 0; k < 8; k++) {
                    for (int h = 0; h < 8; h++) {
                        char c = board[i + k].charAt(j + h);
                        // 홀수 번째 줄 일 때
                        if (k % 2 == 0) {
                            if (h % 2 == 0 && c == 'W')
                                count++;
                            else if (h % 2 != 0 && c == 'B')
                                count++;
                        }
                        // 짝수 번째 줄 일 떄
                        else {
                            if (h % 2 == 0 && c == 'B')
                                count++;
                            else if (h % 2 != 0 && c == 'W')
                                count++;
                        }
                    }
                }
                // 처음 문자가 W 일 때 바꿔야하는 개수가 적을 경우
                if (min > 64 - count)
                    min = 64 - count;

                // 처음 문자가 B 일 때 바꿔야하는 개수가 적을 경우
                else if (count < 32 && min > count)
                    min = count;
            }
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}
