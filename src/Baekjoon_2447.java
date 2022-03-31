import java.io.*;

public class Baekjoon_2447 {
    static String[][] matrix;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        matrix = new String[size][size];
        star(0, 0, size, false);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                bw.write(matrix[i][j]);
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    // true: 공백 넣기, false: 별 넣기
    static void star(int x, int y, int size, boolean blank) {
        if (blank) {
            for (int i = x; i < x + size; i++) {
                for (int j = y; j < y + size; j++) {
                    matrix[i][j] = " ";
                }
            }
        } else if (size == 1) {
            matrix[x][y] = "*";
        } else {
            int div = size / 3;
            int count = 0;
            for (int i = x; i < x + size; i += div) {
                for (int j = y; j < y + size; j += div) {
                    count++;
                    star(i, j, div, count == 5);
                }
            }
        }
    }
}
