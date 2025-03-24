package algo_5_sorting_searching.algo_8_이분검색;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int solution(int[] arr, int m) {
        int last = arr.length - 1;
        int first = 0;
        while (last >= first) {
            int half = (last + first) / 2;
            if (arr[half] == m) {
                return half + 1;
            }
            if (arr[half] > m) {
                last = half - 1;
            }
            if (arr[half] < m) {
                first = half + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(solution(arr, m));
    }
}
