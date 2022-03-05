import java.io.*;

public class Baekjoon_2869 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] data = br.readLine().split(" ");
        int A = Integer.parseInt(data[0]);
        int B = Integer.parseInt(data[1]);
        int V = Integer.parseInt(data[2]);
        int day = (V - A) / (A - B);
        int remain = (V - A) % (A - B);

        if(V<=A){
            day = 1;
        }else if(day==0){
            day=2;
        }else if(remain==0){
            day++;
        }else{
            day+=2;
        }

        bw.write(String.valueOf(day));
        bw.flush();
        bw.close();
    }
}
