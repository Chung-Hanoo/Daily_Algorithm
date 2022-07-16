import java.io.*;
import java.util.Arrays;

public class Baekjoon_2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[] list = new int[count];

        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(list, 0, list.length - 1);

        for (int i = 0; i < list.length; i++) {
            bw.write(String.valueOf(list[i]) + '\n');
        }
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int[] list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    public static void merge(int[] list, int left, int mid, int right) {
        int[] leftList = Arrays.copyOfRange(list, left, mid + 1);
        int[] rightList = Arrays.copyOfRange(list, mid + 1, right + 1);

        int i = 0, j = 0;

        while (i < leftList.length && j < rightList.length) {
            if (leftList[i] <= rightList[j])
                list[left] = leftList[i++];
            else
                list[left] = rightList[j++];
            left++;
        }
        while (i < leftList.length) {
            list[left++] = leftList[i++];
        }
        while (j < rightList.length) {
            list[left++] = rightList[j++];
        }
    }
}
