import java.io.*;
import java.math.*;

public class Baekjoon_10757 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] data = br.readLine().split(" ");
        int max_count = Math.max(data[0].length(), data[1].length());

        int[] A = new int[max_count + 1];
        int[] B = new int[max_count + 1];

        for (int i = data[0].length() - 1, j = 0; i >= 0; i--, j++) {
            A[j] = data[0].charAt(i) - '0';
        }
        for (int i = data[1].length() - 1, j = 0; i >= 0; i--, j++) {
            B[j] = data[1].charAt(i) - '0';
        }
        for (int i = 0; i < max_count; i++) {
            int sum = A[i] + B[i];
            A[i] = sum % 10;
            A[i + 1] += (sum / 10);
        }

        if (A[max_count] != 0)
            bw.write(String.valueOf(A[max_count]));
        for (int i = max_count - 1; i >= 0; i--)
            bw.write(String.valueOf(A[i]));

        bw.flush();
        bw.close();
    }

    /*
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] data = br.readLine().split(" ");
        BigInteger A = new BigInteger(data[0]);
        BigInteger B = new BigInteger(data[1]);

        bw.write(String.valueOf(A.add(B)));
        bw.flush();
        bw.close();
    }*/
}
