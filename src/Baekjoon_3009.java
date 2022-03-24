import java.io.*;
import java.util.*;

public class Baekjoon_3009 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = new int[3];
        int[] y = new int[3];
        int xData;
        int yData;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        if (x[0] == x[1])
            xData = x[2];
        else if (x[1] == x[2])
            xData = x[0];
        else
            xData = x[1];

        if (y[0] == y[1])
            yData = y[2];
        else if (y[1] == y[2])
            yData = y[0];
        else
            yData = y[1];

        bw.write(xData + " " + yData);
        bw.flush();
        bw.close();
    }
}
