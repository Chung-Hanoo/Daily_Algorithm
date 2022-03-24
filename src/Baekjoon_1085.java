import java.io.*;
import java.util.*;

public class Baekjoon_1085 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] data = new int[4];
        int shortest = 0;
        // x,y는 현재 위치
        // w,h는 직사각형 크기
        // 0:x, 1:y, 2:w, 3:h

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int x_min = Math.min(x, w - x);    // x축 최소거리
        int y_min = Math.min(y, h - y);    // y축 최소거리

        bw.write(String.valueOf(Math.min(x_min, y_min)));
        bw.flush();
        bw.close();
    }
}
