package algo_2_TwoPointer_SlidingWindow.algo_2_공통원소;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static void solution(int n, int m, int[] arr, int[] arr2) {
        int idx1 = 0;
        int idx2 = 0;
        Arrays.sort(arr);
        Arrays.sort(arr2);
        ArrayList<Integer> answer = new ArrayList<>();
        while (idx1 < n && idx2 < m) {
            if (arr[idx1] == arr2[idx2]) {
                answer.add(arr[idx1++]);
                idx2++;
                continue;
            }
            if (arr[idx1] > arr2[idx2]) {
                idx2++;
                continue;
            }
            idx1++;
        }
        for (Integer ans : answer) {
            System.out.print(ans + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = getArr(n, sc);
        int m = sc.nextInt();
        int[] arr2 = getArr(m, sc);
        solution(n, m, arr, arr2);
    }

    private static int[] getArr(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
