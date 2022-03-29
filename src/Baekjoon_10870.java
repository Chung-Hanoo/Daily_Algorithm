import java.io.*;

public class Baekjoon_10870 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(Fibo(count)));
        bw.flush();
        bw.close();
    }

    static public int Fibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return Fibo(n - 2) + Fibo(n - 1);
    }
}
